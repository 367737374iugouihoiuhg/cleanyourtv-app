package tv.cleanyour.app

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import android.os.LocaleList
import java.util.Locale

// The app's own language choice (M8 App settings, next to haptics and large text).
//
// Why not androidx.appcompat's per-app locales or API 33's LocaleManager: MainActivity is a plain
// ComponentActivity (no AppCompat), and the app must run back to minSdk 28. So the choice is stored
// in one tiny synchronous file and applied by wrapping the base context in MainActivity's
// attachBaseContext, which the whole Compose tree then reads its strings from.
//
// The store is a SharedPreferences mirror, not the DocumentStore settings.txt the other app
// preferences use: the value has to be readable before any coroutine or the DI graph exists, and it
// must be committed before the screen is recreated, so it lives here, in the Android layer, and the
// settings screen reads and writes it directly through these calls.
//
// The tags map to BCP-47 script-qualified resources (values-b+zh+Hans, values-b+zh+Hant) so both a
// manual choice and a Chinese phone's own system language resolve to the same file, whatever region
// the phone reports.
object LocalePrefs {

    const val AUTO = "auto"          // follow the phone's own language (default)
    const val EN = "en"              // English
    const val ZH_HANS = "zh-Hans"    // 简体中文
    const val ZH_HANT = "zh-Hant"    // 繁體中文

    val ORDER = listOf(AUTO, EN, ZH_HANS, ZH_HANT)

    private const val PREFS = "cyt_locale"
    private const val KEY = "lang"

    // The chosen tag, or AUTO when the person has never changed it. A value outside the known set is
    // treated as AUTO, so a tag from an older or newer build never strands the app in a missing file.
    fun get(context: Context): String {
        val tag = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(KEY, AUTO) ?: AUTO
        return if (tag in ORDER) tag else AUTO
    }

    fun set(context: Context, tag: String) {
        val safe = if (tag in ORDER) tag else AUTO
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(KEY, safe).commit()
    }

    // The resource locale a manual tag selects; null for AUTO (leave the system's own locales alone).
    private fun localeFor(tag: String): Locale? = when (tag) {
        EN -> Locale.ENGLISH
        ZH_HANS -> Locale.Builder().setLanguage("zh").setScript("Hans").build()
        ZH_HANT -> Locale.Builder().setLanguage("zh").setScript("Hant").build()
        else -> null
    }

    // A context whose resources read the chosen language, or the same context untouched for AUTO.
    // The current Configuration is cloned and only its locales replaced, so density, screen size and
    // font scale carry over unchanged (createConfigurationContext on a bare Configuration would).
    fun wrap(base: Context): Context {
        val locale = localeFor(get(base)) ?: return base
        val config = Configuration(base.resources.configuration)
        config.setLocales(LocaleList(locale))
        @Suppress("DEPRECATION")
        config.userLocale = locale
        return base.createConfigurationContext(config)
    }
}

// The Activity behind a Compose Context (LocalContext wraps the activity in ContextWrappers),
// so changing the language can recreate it and let attachBaseContext apply the new locale.
fun Context.findActivity(): Activity? {
    var ctx: Context = this
    while (ctx is ContextWrapper) {
        if (ctx is Activity) return ctx
        ctx = ctx.baseContext
    }
    return null
}
