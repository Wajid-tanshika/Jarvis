
plugins {
    id("com.android.application") version "8.9.2"
    id("org.jetbrains.kotlin.android") version "2.1.20"
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
