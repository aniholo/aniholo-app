plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(Config.Build.compileSdk)

    defaultConfig {
        minSdkVersion(Config.Build.minSdk)
        targetSdkVersion(Config.Build.targetSdk)

        versionCode = Config.App.versionCode
        versionName = Config.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":domain"))

    implementation(Deps.Kotlin.kotlin_std)
    implementation(Deps.DI.koin_android)

    testImplementation(Deps.Test.junit)
    androidTestImplementation(Deps.Test.android_junit)
    androidTestImplementation(Deps.Test.runner)
}
