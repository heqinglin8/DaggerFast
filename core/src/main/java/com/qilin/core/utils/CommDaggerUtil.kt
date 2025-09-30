package com.qilin.core.utils

import android.util.Log
import com.qilin.core.dagger.component.AppComponent
import com.qilin.core.dagger.component.DaggerAppComponent

object CommDaggerUtil {

    const val TAG = "CommDaggerUtil"
    private lateinit var mComponent: AppComponent

    fun init() {
        Log.d(TAG, "init")
        val appComponent = DaggerAppComponent.create()
        this.mComponent = appComponent
//        AndroidBaseComponent.injectComponent(appComponent)
        Log.d(TAG, "injectComponent appComponent:$appComponent")
    }

    val appComponent
        get() = mComponent

}