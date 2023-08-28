import org.gradle.api.JavaVersion

object Configs {
    const val compileSdk = 33
    const val applicationId = "com.trinity.catalog_to_feed"
    const val minSdk = 26
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"

    object BuildTypes {
        const val isMinifyEnabled = true
        const val proguard_file = "proguard-android-optimize.txt"
        const val proguard_rules = "proguard-rules.pro"

    }
}
