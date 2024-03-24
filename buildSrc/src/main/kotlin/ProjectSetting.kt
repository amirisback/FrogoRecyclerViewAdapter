/*
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object ProjectSetting {
    // project settings
    const val NAME_APP = "Frogo Recycler View"
    val NAME_APK = NAME_APP.lowercase().replace(" ", "-")

    const val APP_DOMAIN = "com"
    const val APP_PLAY_CONSOLE = "frogobox"

    const val APP_NAME = "apprecycler"

    const val VERSION_MAJOR = 4
    const val VERSION_MINOR = 4
    const val VERSION_PATCH = 0

    const val PROJECT_MIN_SDK = Version.Gradle.minSdk
    const val PROJECT_COMPILE_SDK = Version.Gradle.compileSdk
    const val PROJECT_TARGET_SDK = Version.Gradle.targetSdk

    const val PROJECT_APP_ID = "$APP_DOMAIN.$APP_PLAY_CONSOLE.$APP_NAME"
    const val PROJECT_VERSION_CODE = (VERSION_MAJOR * 100) + (VERSION_MINOR * 10) + (VERSION_PATCH * 1)
    const val PROJECT_VERSION_NAME = "$VERSION_MAJOR.$VERSION_MINOR.$VERSION_PATCH"

    // Key Store
    const val PLAYSTORE_STORE_FILE = "frogoboxmedia.jks"
    const val PLAYSTORE_STORE_PASSWORD = "amirisback"
    const val PLAYSTORE_KEY_ALIAS = "frogoisback"
    const val PLAYSTORE_KEY_PASSWORD = "amirisback"

}
