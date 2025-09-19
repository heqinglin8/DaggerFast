package com.example.daggerdemo

import android.app.Application
import com.example.daggerdemo.dagger.component.DaggerApplicationComponent

class MyApplication : Application(){
    val appComponent = DaggerApplicationComponent.create()
    override fun onCreate() {
        super.onCreate()
    }
}
