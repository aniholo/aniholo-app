import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("java-library")
    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))

    testImplementation("junit:junit:4.12")
}
