buildscript {
    dependencies {
        classpath(ClassPath.HILT)
    }
}

plugins {
    id(Plugin.APPLICACTION) version (Version.applicationPluginVersion) apply false
    id(Plugin.LIBRARY) version (Version.libraryPluginVersion) apply false
    id(Plugin.KOTLIN) version (Version.kotlinPluginVersion) apply false
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}