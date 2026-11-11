<p align="center">
  <img src="docs/images/banner-3-steps.png" width="800" alt="Clean Your TV 的社群手機應用。用手機清理你的電視，無需電腦，無需程式代理。在 Android 手機上開啟應用，點一下開始，約五分鐘後廣告和冗餘應用就沒了。三個步驟：連線、分析、清理。">
</p>

<p align="center">
  <a href="https://github.com/367737374iugouihoiuhg/cleanyourtv-app/releases/tag/v0.4.8-zh"><img src="https://img.shields.io/github/v/release/udhaykumarbala/cleanyourtv-app?style=flat&color=E8A84C&labelColor=15181e&label=download%20APK" alt="下載最新版 APK"></a>
  <img src="https://img.shields.io/badge/TVs-173%20lists%20%C2%B7%2047%20brands-E8A84C?style=flat&labelColor=15181e" alt="來自 47 個品牌的 173 份電視清單">
  <img src="https://img.shields.io/badge/phone-Android%209%2B-E8A84C?style=flat&labelColor=15181e" alt="Android 9 或更新">
  <img src="https://img.shields.io/badge/languages-English%20%C2%B7%20%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87%20%C2%B7%20%E7%B9%81%E9%AB%94%E4%B8%AD%E6%96%87-E8A84C?style=flat&labelColor=15181e" alt="支援英文、簡體中文與繁體中文">
  <a href="LICENSE"><img src="https://img.shields.io/badge/licence-MIT-E8A84C?style=flat&labelColor=15181e" alt="MIT 授權"></a>
</p>

<h3 align="center">一款由社群打造的手機應用，服務於 <a href="https://github.com/Gathin23/cleanyourtv">Clean Your TV</a>。<br>人人都能清理自己的電視：無需電腦，無需程式代理，無需線材。</h3>

<p align="center">
  <a href="README.en.md"><b>English</b></a> ·
  <a href="README.md"><b>简体中文</b></a> ·
  <b>繁體中文</b>
</p>

<p align="center">
  <a href="https://github.com/367737374iugouihoiuhg/cleanyourtv-app/releases/tag/v0.4.8-zh"><b>下載</b></a> ·
  <a href="https://apps.obtainium.imranr.dev/redirect?r=obtainium://add/https://github.com/367737374iugouihoiuhg/cleanyourtv-app"><b>用 Obtainium 取得</b></a> ·
  <a href="#工作原理"><b>工作原理</b></a> ·
  <a href="#安全設計"><b>安全嗎？</b></a> ·
  <a href="#支援的電視"><b>支援的電視</b></a> ·
  <a href="#應用內語言"><b>應用內語言</b></a>
  <br><sub>Obtainium 會追蹤本應用的 GitHub 發布，並自動為你更新。</sub>
</p>

<p align="center">
  <img src="docs/images/connect-analyse-clean-hd.gif" width="800" alt="三個步驟，手機與電視並列。1 連線：應用找到電視，電視詢問是否允許這台手機。2 分析：手機讀取電視，列出 22 項建議關閉的內容，此時電視尚未有任何改動。3 清理：手機顯示「開始清理」，電視上出現一盞燈籠掃過舊卡片、把它們收進柔和的黑洞，最終電視停在新的主畫面上。">
</p>

## 工作原理

| 1. 連線 | 2. 分析 | 3. 清理 |
| :-: | :-: | :-: |
| <img src="docs/images/phone-connect.png" width="220" alt="看向電視：電視詢問是否信任這台手機；勾選「一律允許」，再選擇確定"> | <img src="docs/images/phone-what-we-found.png" width="220" alt="我們發現 22 項建議關閉的內容，依廣告、追蹤、沒人想要的應用和品牌附加項分組，下方列出所有會保留的內容"> | <img src="docs/images/phone-done.png" width="220" alt="你的電視已就緒：關閉了 23 項，新主畫面已開啟，所有內容都能還原"> |
| 應用在 Wi-Fi 上找到你的電視，並教你用遙控器放行這台手機。 | 它讀取電視上的內容並給出方案：哪些會關閉、哪些會保留。此時尚未改動任何東西。 | 點「開始清理」。先建立一個還原點，接著冗餘內容被關閉、新的主畫面被啟用。 |

**你需要** 一台與電視連在同個 Wi-Fi 下的 Android 手機（Android 9 或更新，並設定鎖定螢幕）。
[下載 APK](https://github.com/367737374iugouihoiuhg/cleanyourtv-app/releases/tag/v0.4.8-zh)，開啟即可安裝。連線約需
一分鐘（你用遙控器開啟網路偵錯，應用會教你怎麼做），整個清理過程約五分鐘。

你隨時可以回來還原某個應用、在電視系統更新後檢查有無殘留、更換底部 dock 或外觀，或撤銷全部改動。

## 你的電視能得到什麼

目前並非每款電視都能啟用新主畫面。在動手改動之前，應用會在「我們發現」畫面上告訴你你的電視能得到
下面哪一檔，以及原因。

| | 哪些電視 | 應用會做什麼 |
| :- | :- | :- |
| **新主畫面 + 完整清理** | 測試者確認過重啟後切換依然生效的電視：多數 Android 9 至 11 的小米和紅米機型，以及 Android 14 上的小米 MiTV-MZTU1、MiTV-MOEU1；Android 11 的一加、Android 8 的索尼、Android 9 的海信、Android 14 的 Homatics、MECOOL 和 Strong LEAP-S1、Android 11 的東芝智慧電視（hamamatsucho）、Android 9 的 MI MiProjM05 投影機（使用 Google 的 Android TV 主畫面）；以及清單中標明支援的 TCL、索尼、海信、飛利浦等其他型號 | 關閉冗餘內容，讓 Clean Your TV 主畫面接管，並先建立一個還原點 |
| **暫僅清理** | 多數 Google TV 機型（它們的設定精靈會占用 Wi-Fi，或該電視還沒有清單）、應用從未見過的電視，以及 Google 自家的 Chromecast 和 TV Streamer（切換會犧牲投放功能） | 關閉廣告、追蹤和背景應用。電視保留自己的主畫面，所以看起來不變；由那個主畫面繪製的廣告也就隨之保留 |
| **無法處理** | Fire TV、TCL 的中國版本、Android 7 及更早 | 僅做清理，應用會事先說明 |

[電視清單](https://udhaykumarbala.github.io/cleanyourtv-app/tvs/) 會說明每款型號目前能得到什麼、
哪些在測試版裡、哪些即將支援。還沒有專屬清單的電視，只要它的主人在應用裡發出它的報告
（「協助加入此電視」），就能被提升上去。

## 清理電視的兩種方式

[Clean Your TV](https://github.com/Gathin23/cleanyourtv) 用社群測試過的清單，為任意 Android TV 提供
一個清爽、無廣告的主畫面，並關閉冗餘應用。它本身需要一台電腦：你來執行它的腳本，或把它的提示詞交給
程式代理。而這個應用，把整件事全交給你的手機完成。

| | Clean Your TV 倉庫 | **Clean Your TV 應用**（本倉庫） |
| :- | :- | :- |
| **你需要** | 一台裝有 ADB 的電腦，或一個像是 Claude Code 的程式代理 | **只需一台 Android 手機**，與電視在同個 Wi-Fi 下 |
| **你要做** | 執行腳本，或把提示詞交給代理 | **點開始、核對方案、點「開始清理」** |
| **為誰而做** | 玩機玩家、主題和新電視清單 | **所有人**：你、你的父母、你的朋友 |

兩者都給你同一個 Clean Your TV 主畫面、同一批社群電視清單，都以不解除安裝的方式關閉應用，並為每一處改動保留退路。

## 安全設計

- **每一步你都看得見。** 在你看過方案之前什麼都不會執行；「自訂」會依序列出應用將要傳送的每條指令。
- **什麼都不刪除。** 應用是對主要使用者關閉的，所以每一個都能回來。Wi-Fi、Play 商店、遙控器、電視的訊號源
  以及 Android 必需的部件都受保護、絕不會被碰；無障礙功能、投放、語音和更新只有在你選擇時才關閉。
- **任何改動都能撤銷。** 從還原點單獨還原某個應用，或還原全部。「儲存副本」會匯出純文字的還原腳本，
  在任何裝有 adb 的電腦上都能用，即便沒有這個應用也行。
- **電視上有個看門狗。** 如果手機在 150 秒內沒有確認新主畫面（Wi-Fi 斷線、手機沒電），電視會自行恢復
  它原本的主畫面。
- **在關鍵處格外小心。** 在那些已知切換主畫面會出問題的電視上，應用只做清理，並告訴你原因。
- **保護隱私。** 無帳號、無數據統計、無廣告。應用只與你的電視通訊，且僅在你請求時與 GitHub 通訊取得更新。
  除非你堅持開著，網路偵錯會在結束時重新關閉。

## 支援的電視

**來自 47 個品牌的 173 份電視清單**，取自 Clean Your TV 社群清單：TCL、索尼、小米、海信、飛利浦、
Amazon Fire TV、松下、極米 XGIMI、明基 BenQ、NVIDIA Shield、onn、Google 等等，涵蓋 Android TV、
Google TV 和 Fire OS。尚無人收錄的型號，也能得到一份基於其品牌的、謹慎的清理。

<details>
<summary>細節</summary>

- **設定檔：** TCL（26 份清單）、索尼（22）、小米（29）、海信、飛利浦、Amazon Fire TV、松下、極米、
  明基、NVIDIA Shield、創維 Skyworth、海爾、CHiQ、onn、Google、由 Vestel 代工的機型（JVC、東芝、
  Cecotec）、Freebox Player 等，涵蓋 Android TV、Google TV、Fire OS 以及 TCL 的中國版本。
  每個設定檔都註明了由誰測試。
- **品牌兜底：** 對尚無設定檔的 Amazon、海信、松下、飛利浦、索尼、TCL、極米和小米型號，應用只關閉
  該品牌所有設定檔一致同意的內容，並說明它在保持謹慎。更多內容可在「自訂」裡手動關閉。
- **其他 Android TV** 會得到應用有把握的那部分清理，並保留自己的主畫面，直到為它們準備的清單確認
  切換依然有效（見上文「你的電視能得到什麼」和[電視清單](https://udhaykumarbala.github.io/cleanyourtv-app/tvs/)）。
- **僅清理**（電視保留自己的主畫面，應用會說明原因）：Fire TV、TCL 的中國版本、Android 7、應用不認識的
  廠商主畫面、含 Google TV 的 Chromecast 和 Google TV Streamer（切換會犧牲投放）、每次開機設定精靈都會
  卷土重來的 Kalley 和 PRISM+ 機型，以及必須保留設定精靈的電視。
- **網路偵錯：** 電視需要透過網路使用 ADB（5555 埠）。對於只提供「需要配對碼的無線偵錯」的電視，
  先用電腦配對一次；應用會給出那三條指令。
</details>

**你的電視沒被收錄？** 電視清單存放在 Clean Your TV 裡，所以無論有沒有這個應用，它們都能幫到所有人。
依照它的[貢獻指南](https://github.com/Gathin23/cleanyourtv/blob/main/CONTRIBUTING.md)在那裡加入你的電視，
應用會在下一個版本裡收錄它。另見 [CONTRIBUTING.md](CONTRIBUTING.md#propose-a-tv-profile)。

## 應用內語言

應用支援 **English、简体中文和繁體中文**。預設跟隨你手機的系統語言：簡體中文手機開啟時就是簡體中文，
繁體中文手機就是繁體中文。你也可以在 **應用程式設定 → 語言** 裡手動選擇（跟隨系統 / English / 简体中文 /
繁體中文）。改動會立即生效、重啟後依然保留，並且與手機自身的系統語言相互獨立——所以即使在一台英文
手機上也能把應用設為中文，或在一台中文手機上讓它保持英文。

## 基於 Clean Your TV 打造

- 主畫面是 [Gathin](https://github.com/Gathin23) 的 [Clean Your TV 啟動器](https://github.com/Gathin23/cleanyourtv/tree/main/launcher)。
  應用把它從原始碼建置後內嵌其中。
- 來自 Clean Your TV 的新電視清單和啟動器版本會隨應用的更新一併送達。本應用是一個社群專案；
  關於 Clean Your TV 本身的消息來自 [@gathint](https://x.com/gathint)。
- Clean Your TV 名稱，以及 `tv.cleanyour` 下（取自 `cleanyour.tv`）的應用套件 ID，均經 Gathin 授權使用。
- 是應用本身出了問題？[在這裡提交 issue](https://github.com/udhaykumarbala/cleanyourtv-app/issues)。
  安全性問題：見 [SECURITY.md](SECURITY.md)。

<details>
<summary><b>隱私詳情</b></summary>

- 無帳號、無數據統計、無廣告、無當機回報服務。
- 在你的家庭網路裡，應用只與你選定的電視通訊（5555 埠上的 ADB），並監聽主動廣播自己的電視（mDNS）。
- 在網際網路上，應用只與 GitHub 通訊，且僅在你請求時：「檢查更新」會發出一次取得最新版本的請求，
  選用外掛則從其 GitHub 發布下載。啟動器和電視進度畫面都在 APK 內，因此一般設定根本不會發起任何網路請求。
- 電視所信任的金鑰存放在手機的 Android Keystore 裡，永不離開手機。除非你自己儲存副本，還原點都留在手機上。
- 「回報問題」和「協助加入此電視」會先完整顯示報告，移除位址、序號、金鑰和配對碼，並且自身不傳送任何東西：
  由你來分享或發到 GitHub。
- 權限：網路、網路狀態、Wi-Fi 群播（用於發現電視）、在電視上工作時的前景服務、通知，以及鎖定螢幕提示。
  不含定位、儲存空間、相機或通訊錄。
- 完整政策：[PRIVACY.md](PRIVACY.md)，發布於 [cleanyour.tv/app/android/privacy](https://cleanyour.tv/app/android/privacy)。
</details>

<details>
<summary><b>驗證下載</b></summary>

每個版本都由同一把金鑰簽署，其憑證 SHA-256 為（也見
[docs/release-signer.sha256](docs/release-signer.sha256)）：

```
eaf7af3867bb29ff4bb038854842c93f42ffe4198a087e611cb18f925201cd65
```

```bash
sha256sum cleanyourtv-0.2.0.apk                 # 與版本說明裡的值比對
apksigner verify --print-certs cleanyourtv-0.2.0.apk
```

Android 會拒絕任何由其他金鑰簽署的更新，所以首次安裝之後，每次更新都會替你驗證。建置是可重現的：
對每個發布標籤，CI 都從公開原始碼建置未簽署的 APK，`scripts/verify-release.sh` 會驗證發布出的 APK
恰好就是那個建置加上一個簽署。
</details>

## 面向開發者

```bash
git clone --recurse-submodules https://github.com/udhaykumarbala/cleanyourtv-app.git
cd cleanyourtv-app
./gradlew check assembleDebug        # 需要 JDK 21 和 Android SDK
```

這是一個用 Kotlin 和 Jetpack Compose 編寫的應用，直接與電視溝通 ADB，中間不經過電腦。介面文字存放在
各模組的 `res/values/strings.xml`，簡體中文在 `values-b+zh+Hans`、繁體中文在 `values-b+zh+Hant`；
應用內語言切換及其「跟隨系統」預設行為在 `app/src/main/kotlin/tv/cleanyour/app/LocalePrefs.kt` 裡實作。
[CONTRIBUTING.md](CONTRIBUTING.md) 涵蓋測試、截圖基準、模組規則，以及各版本如何建置與簽署。應用如何
設計與審查見 [docs/history](docs/history/README.md)，各版本改了什麼見 [CHANGELOG.md](CHANGELOG.md)。

本應用在人工審查下由 AI 程式代理開發：維護者確定了設計並審查、測試了應用，每一處改動都經過自動化測試和審查。

## 致謝

- [Clean Your TV](https://github.com/Gathin23/cleanyourtv)，作者 [Gathin](https://github.com/Gathin23)
  及其社群貢獻者——本應用建置於他們的啟動器、清理清單和測試報告之上。
- ADB 協定程式碼始於 mobile.dev 的 [dadb](https://github.com/mobile-dev-inc/dadb)
  （Apache 2.0，見 [adb/wire/NOTICE](adb/wire/NOTICE)）。
- [Outfit](https://github.com/Outfitio/Outfit-Fonts) 字型（SIL Open Font License 1.1）。
- 那些在自己的電視上試用應用並告訴我們體驗的人：[測試者](https://udhaykumarbala.github.io/cleanyourtv-app/testers/)。

完整清單：[THIRD-PARTY-NOTICES](THIRD-PARTY-NOTICES)。授權：[MIT](LICENSE)，與 Clean Your TV 相同。

如果這個應用幫你省下了一整個晚上，你可以[請我喝杯咖啡](https://buymeacoffee.com/udhaykumarbala)。
