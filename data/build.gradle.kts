plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(19)
        targetSdkVersion(28)

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

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

    testImplementation(Deps.Test.junit)
    androidTestImplementation(Deps.Test.runner)
}
