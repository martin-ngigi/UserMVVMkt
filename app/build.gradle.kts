plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    /**
     * Martin added
     */
    id("kotlin-kapt")
//    id("com.google.devtools.ksp")

    id("dagger.hilt.android.plugin")
//    id("androidx.navigation.safeargs.kotlin")
    id("androidx.navigation.safeargs")
//    id("kotlin-android-extensions")
    id("com.google.gms.google-services") version "4.3.14"
}

android {
    namespace = "com.safiribytes.usermvvmkt"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.safiribytes.usermvvmkt"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmTarget = "1.8"
    }

    /**
     * MARTIN ADDED THIS
     */
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //retrofit2
    val retrofit_version = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")

    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation("com.google.code.gson:gson:2.8.9")

    val lifecycle_version = "2.5.1"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")
    kapt("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")

    //Swipe refresh
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    // Lottie
    implementation("com.airbnb.android:lottie:5.0.3")

    //navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.2")

    val coroutines_version = "1.6.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version")

    val roomVersion = "2.4.3"
    implementation("androidx.room:room-runtime:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")

    val dagger_version = "2.42"
    implementation("com.google.dagger:hilt-android:$dagger_version")
    kapt("com.google.dagger:hilt-compiler:$dagger_version")

    val glider_version = "4.13.1"
    implementation("com.github.bumptech.glide:glide:$glider_version")
    kapt("com.github.bumptech.glide:compiler:$glider_version")

    // Easy Permission
    implementation("pub.devrel:easypermissions:3.0.0")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation("androidx.fragment:fragment-ktx:1.4.1")

    //Lifecycle
    implementation("androidx.lifecycle:lifecycle-common:2.4.1")

    //size dp/sp
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")

    // preferences
    implementation("androidx.preference:preference-ktx:1.2.0")
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    //CircularImageView
    implementation("com.github.AtifSayings:CircularImageView:1.0.2")

    //ImagePicker
    implementation("com.github.dhaval2404:imagepicker:2.1")

    //StepProgress
    implementation("com.github.funriser:StepProgress:0.1.0")

    //For requesting permissions at runtime
    implementation("com.karumi:dexter:6.2.2")


//    implementation("")

}