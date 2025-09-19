package com.example.daggerfast

import android.app.Application
import com.example.daggerfast.dagger.component.DaggerApplicationComponent

class MyApplication : Application(){
    val appComponent = DaggerApplicationComponent.create()
    override fun onCreate() {
        super.onCreate()
    }
}
