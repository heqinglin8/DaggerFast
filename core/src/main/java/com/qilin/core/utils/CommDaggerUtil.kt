package com.qilin.core.utils

import android.app.Application
import android.util.Log
import com.qilin.core.component.AppComponent
import com.qilin.core.component.DaggerAppComponent

object CommDaggerUtil {

    const val TAG = "CommDaggerUtil"
    private lateinit var mComponent: AppComponent

    fun init() {
        Log.d(TAG, "init")
        val appComponent = DaggerAppComponent.create()
        this.mComponent = appComponent
        Log.d(TAG, "injectComponent appComponent:$appComponent")
    }

    val appComponent
        get() = mComponent

}