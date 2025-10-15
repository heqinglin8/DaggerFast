package com.qilin.core.utils

import android.util.Log
import com.qilin.core.InjectActivity
import com.qilin.core.InjectComponentActivity
import com.qilin.core.dagger.component.AppComponent
import com.qilin.core.dagger.component.DaggerAppComponent
import com.qilin.core.dagger.viewmodel.AppViewModelFactory

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

    val appViewModelFactory: AppViewModelFactory
        get() = mComponent.viewModelFactory() as AppViewModelFactory

    fun inject(activity: InjectActivity) = mComponent.inject(activity)

    fun inject(activity: InjectComponentActivity) = mComponent.inject(activity)

}