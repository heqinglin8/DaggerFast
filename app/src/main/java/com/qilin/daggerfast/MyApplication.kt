package com.qilin.daggerfast

import android.app.Application
import com.qilin.daggerfast.dagger.component.DaggerApplicationComponent

class MyApplication : Application(){
    val appComponent = DaggerApplicationComponent.create()
    override fun onCreate() {
        super.onCreate()
    }
}
