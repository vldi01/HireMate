rootProject.name = "HireMate"

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }

}

include(":shared")
include(":androidApp")
include(":ktorServer")