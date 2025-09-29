// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
}

buildscript {
    dependencies {
        // Android Gradle插件
        // 添加WMRouter插件
        classpath(libs.router.plugin){
            exclude (group= "com.android.tools.build")
        }
    }
}