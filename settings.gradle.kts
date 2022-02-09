rootProject.name = "testal"

pluginManagement {
    val kotlin_version: String by settings
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {
        id("org.jetbrains.compose") version "1.0.1" apply false
        kotlin("multiplatform") version kotlin_version apply false
        kotlin("plugin.serialization") version kotlin_version apply false
        id("com.palantir.docker") version "0.32.0" apply false
    }
}

include("one")
include("gaia-api")
//include("one2")