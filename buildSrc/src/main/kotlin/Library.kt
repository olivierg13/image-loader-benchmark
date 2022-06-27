@file:Suppress("unused")

package coil

object Library {

    // CORE

    const val KOTLINX_COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0"

    const val ANDROIDX_CORE = "androidx.core:core-ktx:1.3.2"
    const val ANDROIDX_MULTIDEX = "androidx.multidex:multidex:2.0.1"

    private const val OKHTTP_VERSION = "4.10.0"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"

    const val OKIO = "com.squareup.okio:okio:3.1.0"

    // IMAGE LOADERS

    const val COIL = "io.coil-kt:coil-base:2.1.0"

    private const val FRESCO_VERSION = "2.6.0"
    const val FRESCO = "com.facebook.fresco:fresco:$FRESCO_VERSION"
    const val FRESCO_OKHTTP = "com.facebook.fresco:imagepipeline-okhttp3:$FRESCO_VERSION"

    private const val GLIDE_VERSION = "4.13.2"
    const val GLIDE = "com.github.bumptech.glide:glide:$GLIDE_VERSION"
    const val GLIDE_OKHTTP = "com.github.bumptech.glide:okhttp3-integration:$GLIDE_VERSION"

    const val PICASSO_2 = "com.squareup.picasso:picasso:2.8"

    // TEST

    const val ANDROIDX_BENCHMARK = "androidx.benchmark:benchmark-junit4:1.0.0"
    const val ANDROIDX_TEST_CORE = "androidx.test:core-ktx:1.4.0"
    const val ANDROIDX_TEST_ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
    const val ANDROIDX_TEST_JUNIT = "androidx.test.ext:junit-ktx:1.1.2"
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:1.4.0"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:1.4.0"

    const val JUNIT = "junit:junit:4.13.2"

    const val OKHTTP_MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:$OKHTTP_VERSION"
}
