<p align="center">
  <img src="docs/images/banner-3-steps.png" width="800" alt="Clean Your TV 的社区手机应用。用手机清理你的电视，无需电脑，无需编程代理。在 Android 手机上打开应用，点一下开始，大约五分钟后广告和冗余应用就没了。三步：连接、分析、清理。">
</p>

<p align="center">
  <a href="https://github.com/udhaykumarbala/cleanyourtv-app/releases/latest"><img src="https://img.shields.io/github/v/release/udhaykumarbala/cleanyourtv-app?style=flat&color=E8A84C&labelColor=15181e&label=download%20APK" alt="下载最新版 APK"></a>
  <img src="https://img.shields.io/badge/TVs-173%20lists%20%C2%B7%2047%20brands-E8A84C?style=flat&labelColor=15181e" alt="来自 47 个品牌的 173 份电视清单">
  <img src="https://img.shields.io/badge/phone-Android%209%2B-E8A84C?style=flat&labelColor=15181e" alt="Android 9 或更新">
  <img src="https://img.shields.io/badge/languages-English%20%C2%B7%20%E7%AE%80%E4%BD%93%E4%B8%AD%E6%96%87%20%C2%B7%20%E7%B9%81%E9%AB%94%E4%B8%AD%E6%96%87-E8A84C?style=flat&labelColor=15181e" alt="支持英文、简体中文与繁体中文">
  <a href="LICENSE"><img src="https://img.shields.io/badge/licence-MIT-E8A84C?style=flat&labelColor=15181e" alt="MIT 许可证"></a>
</p>

<h3 align="center">一款由社区打造的手机应用，服务于 <a href="https://github.com/Gathin23/cleanyourtv">Clean Your TV</a>。<br>人人都能清理自己的电视：无需电脑，无需编程代理，无需数据线。</h3>

<p align="center">
  <a href="README.md"><b>English</b></a> ·
  <b>简体中文</b> ·
  <a href="README.zh-HK.md"><b>繁體中文</b></a>
</p>

<p align="center">
  <a href="https://github.com/udhaykumarbala/cleanyourtv-app/releases/latest"><b>下载</b></a> ·
  <a href="https://apps.obtainium.imranr.dev/redirect?r=obtainium://add/https://github.com/udhaykumarbala/cleanyourtv-app"><b>用 Obtainium 获取</b></a> ·
  <a href="#工作原理"><b>工作原理</b></a> ·
  <a href="#安全设计"><b>安全吗？</b></a> ·
  <a href="#支持的电视"><b>支持的电视</b></a> ·
  <a href="#应用内语言"><b>应用内语言</b></a>
  <br><sub>Obtainium 会跟踪本应用的 GitHub 发布，并自动为你更新。</sub>
</p>

<p align="center">
  <img src="docs/images/connect-analyse-clean-hd.gif" width="800" alt="三步，手机与电视并列。1 连接：应用找到电视，电视询问是否允许这台手机。2 分析：手机读取电视，列出 22 项建议关闭的内容，电视此时未做任何改动。3 清理：手机显示“开始清理”，电视上出现一盏灯笼扫过旧卡片、把它们收进柔和的黑洞，最终电视停在新的主屏幕上。">
</p>

## 工作原理

| 1. 连接 | 2. 分析 | 3. 清理 |
| :-: | :-: | :-: |
| <img src="docs/images/phone-connect.png" width="220" alt="看向电视：电视询问是否信任这台手机；勾选“始终允许”，再选择确定"> | <img src="docs/images/phone-what-we-found.png" width="220" alt="我们发现 22 项建议关闭的内容，按广告、跟踪、没人想要的应用和品牌附加项分组，下方列出所有会保留的内容"> | <img src="docs/images/phone-done.png" width="220" alt="你的电视已就绪：关闭了 23 项，新主屏幕已开启，所有内容都能还原"> |
| 应用在 Wi-Fi 上找到你的电视，并教你用遥控器放行这台手机。 | 它读取电视上的内容并给出方案：哪些会关闭、哪些会保留。此时还未改动任何东西。 | 点“开始清理”。先建一个还原点，然后冗余内容被关闭、新的主屏幕被启用。 |

**你需要** 一台与电视连在同一 Wi-Fi 下的 Android 手机（Android 9 或更新，并设置锁屏）。
[下载 APK](https://github.com/udhaykumarbala/cleanyourtv-app/releases/latest)，打开即可安装。连接大约
需要一分钟（你用遥控器打开网络调试，应用会教你怎么做），整个清理过程大约五分钟。

你随时可以回来还原某个应用、在电视系统更新后检查有无残留、更换底部 dock 或外观，或撤销全部改动。

## 你的电视能得到什么

目前并非每款电视都能启用新主屏幕。在动手改动之前，应用会在“我们发现”页面上告诉你你的电视能得到
下面哪一档，以及原因。

| | 哪些电视 | 应用会做什么 |
| :- | :- | :- |
| **新主屏幕 + 完整清理** | 测试者确认过重启后切换依然生效的电视：多数 Android 9 至 11 的小米和红米机型，以及 Android 14 上的小米 MiTV-MZTU1、MiTV-MOEU1；Android 11 的一加、Android 8 的索尼、Android 9 的海信、Android 14 的 Homatics、MECOOL 和 Strong LEAP-S1、Android 11 的东芝智能电视（hamamatsucho）、Android 9 的 MI MiProjM05 投影仪（使用 Google 的 Android TV 主屏）；以及清单中标明支持的 TCL、索尼、海信、飞利浦等其他型号 | 关闭冗余内容，让 Clean Your TV 主屏幕接管，并先建立一个还原点 |
| **暂仅清理** | 多数 Google TV 机型（它们的设置向导会占用 Wi-Fi，或该电视还没有清单）、应用从未见过的电视，以及 Google 自家的 Chromecast 和 TV Streamer（切换会牺牲投屏功能） | 关闭广告、跟踪和后台应用。电视保留自己的主屏幕，所以看起来不变；由那个主屏幕渲染的广告也就随之保留 |
| **无法处理** | Fire TV、TCL 的中国大陆版本、Android 7 及更早 | 仅做清理，应用会事先说明 |

[电视清单](https://udhaykumarbala.github.io/cleanyourtv-app/tvs/) 会说明每款型号目前能得到什么、
哪些在测试版里、哪些即将支持。还没有专属清单的电视，只要它的主人在应用里发出它的报告
（“帮助添加此电视”），就能被提升上去。

## 清理电视的两种方式

[Clean Your TV](https://github.com/Gathin23/cleanyourtv) 用社区测试过的清单，为任意 Android TV 提供
一个清爽、无广告的主屏幕，并关闭冗余应用。它本身需要一台电脑：你来运行它的脚本，或把它的提示词交给
编程代理。而这个应用，把整件事全交给你的手机完成。

| | Clean Your TV 仓库 | **Clean Your TV 应用**（本仓库） |
| :- | :- | :- |
| **你需要** | 一台带 ADB 的电脑，或一个像 Claude Code 这样的编程代理 | **只需一台 Android 手机**，与电视在同一 Wi-Fi 下 |
| **你要做** | 运行脚本，或把提示词交给代理 | **点开始、核对方案、点“开始清理”** |
| **为谁而做** | 折腾党、主题和新电视清单 | **所有人**：你、你的父母、你的朋友 |

两者都给你同一个 Clean Your TV 主屏幕、同一批社区电视清单，都以不卸载的方式关闭应用，并为每一处改动保留退路。

## 安全设计

- **每一步你都看得见。** 在你看过方案之前什么都不会执行；“自定义”会按顺序列出应用将要发送的每条命令。
- **什么都不删除。** 应用是对主要用户关闭的，所以每一个都能回来。Wi-Fi、Play 商店、遥控器、电视的信号源
  以及 Android 必需的部件都受保护、绝不会被碰；无障碍、投屏、语音和更新只有在你选择时才关闭。
- **任何改动都能撤销。** 从还原点单独还原某一个应用，或还原全部。“保存副本”会导出纯文本的还原脚本，
  在任何装有 adb 的电脑上都能用，即便没有这个应用也行。
- **电视上有个看门狗。** 如果手机在 150 秒内没有确认新主屏幕（Wi-Fi 断开、手机没电），电视会自行恢复
  它原来的主屏幕。
- **在关键处格外小心。** 在那些已知切换主屏幕会出问题的电视上，应用只做清理，并告诉你原因。
- **保护隐私。** 无账号、无数据统计、无广告。应用只与你的电视通信，且仅在你请求时与 GitHub 通信获取更新。
  除非你坚持开着，网络调试会在结束时重新关闭。

## 支持的电视

**来自 47 个品牌的 173 份电视清单**，取自 Clean Your TV 社区清单：TCL、索尼、小米、海信、飞利浦、
Amazon Fire TV、松下、极米 XGIMI、明基 BenQ、NVIDIA Shield、onn、Google 等等，涵盖 Android TV、
Google TV 和 Fire OS。尚无人收录的型号，也能得到一份基于其品牌的、谨慎的清理。

<details>
<summary>细节</summary>

- **配置档：** TCL（26 份清单）、索尼（22）、小米（29）、海信、飞利浦、Amazon Fire TV、松下、极米、
  明基、NVIDIA Shield、创维 Skyworth、海尔、CHiQ、onn、Google、由 Vestel 代工的机型（JVC、东芝、
  Cecotec）、Freebox Player 等，涵盖 Android TV、Google TV、Fire OS 以及 TCL 的中国大陆版本。
  每个配置档都注明了由谁测试。
- **品牌兜底：** 对尚无配置档的 Amazon、海信、松下、飞利浦、索尼、TCL、极米和小米型号，应用只关闭
  该品牌所有配置档一致同意的内容，并说明它在保持谨慎。更多内容可在“自定义”里手动关闭。
- **其他 Android TV** 会得到应用有把握的那部分清理，并保留自己的主屏幕，直到为它们准备的清单确认
  切换依然有效（见上文“你的电视能得到什么”和[电视清单](https://udhaykumarbala.github.io/cleanyourtv-app/tvs/)）。
- **仅清理**（电视保留自己的主屏幕，应用会说明原因）：Fire TV、TCL 的中国大陆版本、Android 7、应用不认识
  的厂商主屏幕、带 Google TV 的 Chromecast 和 Google TV Streamer（切换会牺牲投屏）、每次开机设置向导都会
  卷土重来的 Kalley 和 PRISM+ 机型，以及必须保留设置向导的电视。
- **网络调试：** 电视需要通过网络使用 ADB（5555 端口）。对于只提供“需要配对码的无线调试”的电视，
  先用电脑配对一次；应用会给出那三条命令。
</details>

**你的电视没被收录？** 电视清单存放在 Clean Your TV 里，所以无论有没有这个应用，它们都能帮到所有人。
按照它的[贡献指南](https://github.com/Gathin23/cleanyourtv/blob/main/CONTRIBUTING.md)在那里添加你的电视，
应用会在下一个版本里收录它。另见 [CONTRIBUTING.md](CONTRIBUTING.md#propose-a-tv-profile)。

## 应用内语言

应用支持 **English、简体中文和繁體中文**。默认跟随你手机的系统语言：简体中文手机打开时就是简体中文，
繁体中文手机就是繁体中文。你也可以在 **应用设置 → 语言** 里手动选择（跟随系统 / English / 简体中文 /
繁體中文）。改动会立即生效、重启后依然保留，并且与手机自身的系统语言相互独立——所以即便在一台英文
手机上也能把应用设为中文，或在一台中文手机上让它保持英文。

## 基于 Clean Your TV 构建

- 主屏幕是 [Gathin](https://github.com/Gathin23) 的 [Clean Your TV 启动器](https://github.com/Gathin23/cleanyourtv/tree/main/launcher)。
  应用把它从源码构建后内置其中。
- 来自 Clean Your TV 的新电视清单和启动器版本会随应用的更新一并送达。本应用是一个社区项目；
  关于 Clean Your TV 本身的消息来自 [@gathint](https://x.com/gathint)。
- Clean Your TV 名称，以及 `tv.cleanyour` 下（取自 `cleanyour.tv`）的应用包 ID，均经 Gathin 许可使用。
- 是应用本身出了问题？[在这里提交 issue](https://github.com/udhaykumarbala/cleanyourtv-app/issues)。
  安全问题：见 [SECURITY.md](SECURITY.md)。

<details>
<summary><b>隐私详情</b></summary>

- 无账号、无数据统计、无广告、无崩溃上报服务。
- 在你的家庭网络里，应用只与你选定的电视通信（5555 端口上的 ADB），并监听主动广播自己的电视（mDNS）。
- 在互联网上，应用只与 GitHub 通信，且仅在你请求时：“检查更新”会发出一次获取最新版本的请求，
  可选插件则从其 GitHub 发布下载。启动器和电视进度屏都在 APK 内，因此常规设置根本不会发起任何网络请求。
- 电视所信任的密钥存放在手机的 Android Keystore 里，永不离开手机。除非你自己保存副本，还原点都留在手机上。
- “报告问题”和“帮助添加此电视”会先完整展示报告，移除地址、序列号、密钥和配对码，并且自身不发送任何东西：
  由你来分享或发到 GitHub。
- 权限：网络、网络状态、Wi-Fi 组播（用于发现电视）、在电视上工作时的前台服务、通知，以及锁屏提示。
  不含位置、存储、相机或通讯录。
- 完整政策：[PRIVACY.md](PRIVACY.md)，发布于 [cleanyour.tv/app/android/privacy](https://cleanyour.tv/app/android/privacy)。
</details>

<details>
<summary><b>校验下载</b></summary>

每个版本都由同一把密钥签名，其证书 SHA-256 为（也见
[docs/release-signer.sha256](docs/release-signer.sha256)）：

```
eaf7af3867bb29ff4bb038854842c93f42ffe4198a087e611cb18f925201cd65
```

```bash
sha256sum cleanyourtv-0.2.0.apk                 # 与版本说明里的值比对
apksigner verify --print-certs cleanyourtv-0.2.0.apk
```

Android 会拒绝任何由其他密钥签名的更新，所以首次安装之后，每次更新都会替你校验。构建是可复现的：
对每个发布标签，CI 都从公开源码构建未签名的 APK，`scripts/verify-release.sh` 会校验发布出的 APK
恰好就是那个构建加上一个签名。
</details>

## 面向开发者

```bash
git clone --recurse-submodules https://github.com/udhaykumarbala/cleanyourtv-app.git
cd cleanyourtv-app
./gradlew check assembleDebug        # 需要 JDK 21 和 Android SDK
```

这是一个用 Kotlin 和 Jetpack Compose 编写的应用，直接与电视讲 ADB，中间不经过电脑。界面文案存放在
各模块的 `res/values/strings.xml`，简体中文在 `values-b+zh+Hans`、繁体中文在 `values-b+zh+Hant`；
应用内语言切换及其“跟随系统”默认行为在 `app/src/main/kotlin/tv/cleanyour/app/LocalePrefs.kt` 里实现。
[CONTRIBUTING.md](CONTRIBUTING.md) 涵盖测试、截图基准、模块规则，以及各版本如何构建与签名。应用如何
设计与评审见 [docs/history](docs/history/README.md)，各版本改了什么见 [CHANGELOG.md](CHANGELOG.md)。

本应用在人工评审下由 AI 编程代理开发：维护者确定了设计并审阅、测试了应用，每一处改动都经过自动化测试和评审。

## 致谢

- [Clean Your TV](https://github.com/Gathin23/cleanyourtv)，作者 [Gathin](https://github.com/Gathin23)
  及其社区贡献者——本应用构建于他们的启动器、清理清单和测试报告之上。
- ADB 协议代码始于 mobile.dev 的 [dadb](https://github.com/mobile-dev-inc/dadb)
  （Apache 2.0，见 [adb/wire/NOTICE](adb/wire/NOTICE)）。
- [Outfit](https://github.com/Outfitio/Outfit-Fonts) 字体（SIL Open Font License 1.1）。
- 那些在自己的电视上试用应用并告诉我们体验的人：[测试者](https://udhaykumarbala.github.io/cleanyourtv-app/testers/)。

完整清单：[THIRD-PARTY-NOTICES](THIRD-PARTY-NOTICES)。许可证：[MIT](LICENSE)，与 Clean Your TV 相同。

如果这个应用帮你省下了一整个晚上，你可以[请我喝杯咖啡](https://buymeacoffee.com/udhaykumarbala)。
