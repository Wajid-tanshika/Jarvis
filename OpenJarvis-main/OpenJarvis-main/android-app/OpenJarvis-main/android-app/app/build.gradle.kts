plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.wajid.openjarvis"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.wajid.openjarvis"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
