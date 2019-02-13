object Deps {

    object Kotlin {
        val version = "1.3.21"
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    }

    object Android {
        val compat = "com.android.support:appcompat-v7:28.0.0"
        val constraint_layout = "com.android.support.constraint:constraint-layout:1.1.3"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val runner = "com.android.support.test:runner:1.0.2"
        val espresso = "com.android.support.test.espresso:espresso-core:3.0.2"
    }
}
