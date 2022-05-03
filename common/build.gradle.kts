plugins {
    id(Plugin.LIBRARY)
    id(Plugin.KOTLIN)
}

android {
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        minSdk = ConfigData.minSdk
        targetSdk = ConfigData.targetSdk

        testInstrumentationRunner = Plugin.runner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Plugin.jvmTarget
    }
}

dependencies {

    implementation(Dependency.KTS_CORE)
    testImplementation(Dependency.JUNIT)
    androidTestImplementation(Dependency.TEST_JUNIT)
    androidTestImplementation(Dependency.ESPRESSO)
}