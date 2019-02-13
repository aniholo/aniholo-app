object Deps {

    object Kotlin {
        val version = "1.3.21"
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    }

    object Android {
        val compat = "androidx.appcompat:appcompat:1.0.0"
        val constraint_layout = "androidx.constraintlayout:constraintlayout:1.1.2"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val android_junit = "androidx.test.ext:junit:1.1.0"
        val runner = "androidx.test:runner:1.1.0"
        val espresso = "androidx.test.espresso:espresso-core:3.1.0"
    }
}
