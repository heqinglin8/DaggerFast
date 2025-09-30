package com.qilin.core.dagger

import android.app.Application
import android.util.Log
import androidx.annotation.StringRes
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

interface IViewModel

open class BaseViewModel : ViewModel(), IViewModel {
    protected val myTag: String = this.javaClass.simpleName

    init {
        Log.i(myTag, "ViewModel init.")
    }

    override fun onCleared() {
        Log.i(myTag, "ViewModel onCleared.")
        super.onCleared()
//        mJob?.cancel()
//        EventUtil.unregister(this)
//        EventCenter.removeSource(this)
    }

//    private var mJob: Job? = null
//    val viewModelScope by lazy {
//        CoroutineScope(TDispatchers.Main + EmptyCoroutineAlert() + CoroutineExceptionGuardian
//                + SupervisorJob().also { mJob = it })
//    }
}

open class AndroidBaseViewModel(application: Application)
    : AndroidViewModel(application), IViewModel {

    protected val myTag: String = this.javaClass.simpleName

    init {
        Log.i(myTag, "ViewModel init.")
    }

//    private var mJob: Job? = null
//    val viewModelScope by lazy {
//        CoroutineScope(TDispatchers.Main + EmptyCoroutineAlert()
//                + SupervisorJob().also { mJob = it })
//    }

    override fun onCleared() {
        Log.i(myTag, "ViewModel onCleared")
        super.onCleared()
//        mJob?.cancel()
//        EventUtil.unregister(this)
//        EventCenter.removeSource(this)
    }

    protected fun getString(@StringRes resId: Int, vararg formatArgs: Any): String {
        return getApp().getString(resId, *formatArgs)
    }

    protected fun getApp() = getApplication<Application>()
}