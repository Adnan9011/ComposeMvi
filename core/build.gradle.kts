plugins {
    id(Plugin.LIBRARY)
    id(Plugin.KOTLIN)
    id(Plugin.HILT)
    kotlin(Plugin.KAPT)
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

    // Kts
    implementation(Dependency.KTS_CORE)

    // AppCompat
    implementation(Dependency.APP_COMPAT)

    implementation(Dependency.LIFECYCLE_REACTIVE)

    // Rx
    implementation(Dependency.RX_ANDROID)
    implementation(Dependency.RX_JAVA)

    // Hilt
    implementation(Dependency.HILT_ANDROID)
    kapt(Dependency.HILT_COMPILER_DAGGER)
    kapt(Dependency.HILT_COMPILER_ANDROIDX)
    implementation(Dependency.HILT_WORK)
    implementation(Dependency.HILT_LIFECYCLE)

    testImplementation(Dependency.JUNIT)
    androidTestImplementation(Dependency.TEST_JUNIT)
    androidTestImplementation(Dependency.ESPRESSO)
}