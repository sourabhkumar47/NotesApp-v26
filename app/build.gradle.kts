plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)


    // added kotlin annotation plugin
    id ("kotlin-kapt")

//    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.notesapp_v26"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notesapp_v26"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

//start
    // Room and Lifecycle dependencies
    implementation("androidx.room:room-runtime:2.6.0-alpha02")
    implementation("com.google.firebase:firebase-auth:21.1.0")
    kapt("androidx.room:room-compiler:2.6.1")
    //kotlin extensions for coroutine support with room
    implementation("androidx.room:room-ktx:2.6.1")

    //kotlin extension for coroutine support with activities
    implementation("androidx.activity:activity-ktx:1.8.2")
//end

    implementation(platform("com.google.firebase:firebase-bom:31.5.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.android.gms:play-services-auth:20.5.0")
    // Firebase Cloud FireStore Dependency
    implementation("com.google.firebase:firebase-firestore:24.10.0")

    // Navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
}