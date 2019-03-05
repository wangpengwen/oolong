import oolong.Dependencies
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile

plugins {
    kotlin("jvm")
}

repositories {
    jcenter()
}

val compileKotlin by tasks.getting(KotlinJvmCompile::class) {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":oolong"))
    implementation(project(":samples:counter:core"))
    implementation(Dependencies.Kotlin.StdLib)
    implementation(Dependencies.Kotlin.Coroutines.Core)
    implementation(Dependencies.Kotlin.Coroutines.JavaFX)
    implementation(Dependencies.TornadoFX)
}