object Dependency {
    // Compose
    val COMPOSE_UI by lazy { "androidx.compose.ui:ui:${Version.composeVersion}" }
    val COMPOSE_MATERIAL by lazy { "androidx.compose.material:material:${Version.composeVersion}" }
    val COMPOSE_UI_TOOLING_PREVIEW by lazy { "androidx.compose.ui:ui-tooling-preview:${Version.composeVersion}" }
    val COMPOSE_LIFECYCLE by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Version.composeLifecycleVersion}" }
    val COMPOSE_ACTIVITY by lazy { "androidx.activity:activity-compose:${Version.composeActivityVersion}" }
    val COMPOSE_RUNTIME by lazy { "androidx.compose.runtime:runtime:${Version.composeVersion}" }
    val COMPOSE_RUNTIME_LIVEDATA by lazy { "androidx.compose.runtime:runtime-livedata:${Version.composeVersion}" }
    val COMPOSE_RUNTIME_RXJAVA3 by lazy { "androidx.compose.runtime:runtime-rxjava3:${Version.composeVersion}" }
    val COMPOSE_COMPILER by lazy { "androidx.compose.compiler:compiler:${Version.composeVersion}" }
    val COMPOSE_FONDATION by lazy { "androidx.compose.foundation:foundation:${Version.composeVersion}" }

    val COMPOSE_FONDATION_LAYOUT by lazy { "androidx.compose.foundation:foundation-layout:${Version.composeVersion}" }

    val COMPOSE_UI_TOOLING by lazy { "androidx.compose.ui:ui-tooling:${Version.composeVersion}" }

    val COMPOSE_CONSTRAINTLAYOUT by lazy { "androidx.constraintlayout:constraintlayout-compose:${Version.composeConstraintLayoutVersion}" }

    //
    val APP_COMPAT by lazy { "androidx.appcompat:appcompat:${Version.appcompatVersion}" }
    val CONSTRAINT by lazy { "androidx.constraintlayout:constraintlayout:${Version.constraintlayoutVersion}" }
    val LIFECYCLE_REACTIVE by lazy { "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Version.lifecycleReactiveVersion}" }

    // Test
    val JUNIT by lazy { "junit:junit:${Version.junitVersion}" }
    val TEST_JUNIT by lazy { "androidx.test.ext:junit:${Version.testJunitVersion}" }
    val ESPRESSO by lazy { "androidx.test.espresso:espresso-core:${Version.espressoVersion}" }
    val TEST_COMPOSE by lazy { "androidx.compose.ui:ui-test-junit4:${Version.composeVersion}" }

    // Rx
    val RX_ANDROID by lazy { "io.reactivex.rxjava3:rxandroid:${Version.rxAndroidVersion}" }
    val RX_JAVA by lazy { "io.reactivex.rxjava3:rxjava:${Version.rxJavaVersion}" }

    // Hilt
    val HILT_ANDROID by lazy { "com.google.dagger:hilt-android:${Version.hiltVersion}" }
    val HILT_COMPILER_DAGGER by lazy { "com.google.dagger:hilt-compiler:${Version.hiltVersion}" }
    val HILT_COMPILER_ANDROIDX by lazy { "androidx.hilt:hilt-compiler:${Version.hiltCompileVersion}" }
    val HILT_WORK by lazy { "androidx.hilt:hilt-work:${Version.hiltCompileVersion}" }
    val HILT_LIFECYCLE by lazy { "androidx.hilt:hilt-lifecycle-viewmodel:${Version.hiltAndroidxVersion}" }

    // Retrofit
    val RETROFIT by lazy { "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}" }
    val RETROFIT_GSON by lazy { "com.squareup.retrofit2:converter-gson:${Version.retrofitVersion}" }
    val RETROFIT_LOGGING by lazy { "com.squareup.okhttp3:logging-interceptor:${Version.loggingInterceptorVersion}" }

    // Coil
    val Coil by lazy { "io.coil-kt:coil-compose:${Version.coilVersion}" }

    // Ktx
    val KTS_CORE by lazy { "androidx.core:core-ktx:${Version.ktxCoreVersion}" }
    val KTS_ACTIVITY by lazy { "androidx.activity:activity-ktx:${Version.ktxActivityVerstion}" }
    val KTS_FRAGMENT by lazy { "androidx.fragment:fragment-ktx:${Version.ktxFragmentVerstion}" }
    val KTS_LIFECYCLE by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Version.ktxLifecycleVerstion}" }

    // Glide
    val GLIDE by lazy { "com.github.bumptech.glide:glide:${Version.glideVersion}" }

    // Room components
    val ROOM_KTS by lazy { "androidx.room:room-ktx:${Version.roomVersion}" }
    val ROOM_COMPILER by lazy { "androidx.room:room-compiler:${Version.roomVersion}" }
    val ROOM_TESTING by lazy { "androidx.room:room-testing:${Version.roomVersion}" }
}
