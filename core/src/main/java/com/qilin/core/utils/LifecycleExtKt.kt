package com.qilin.core.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qilin.core.InjectActivity
import com.qilin.core.InjectComponentActivity
import java.lang.IllegalStateException

//inline fun <reified T : ViewModel> FragmentActivity.getViewModel(
//    factory: ViewModelProvider.Factory? = null): T {
//    val myFactory = factory ?: (this as? InjectActivity)?.factory
//    return ViewModelProviders.of(this,
//        myFactory ?: AndroidBaseComponent.viewModelFactory()).get(T::class.java)
//}

inline fun <reified T : ViewModel> InjectActivity.getViewModel(
    factory: ViewModelProvider.Factory? = this.viewModelFactory): T {
    if (factory == null){
        throw IllegalArgumentException("factory should not be null")
    }
    return ViewModelProvider(this, factory)[T ::class.java]
}

inline fun <reified T : ViewModel> InjectComponentActivity.getViewModel(
    factory: ViewModelProvider.Factory? = this.viewModelFactory): T {
    if (factory == null){
        throw IllegalArgumentException("factory should not be null")
    }
    return ViewModelProvider(this, viewModelFactory)[T ::class.java]
}


//
//inline fun <reified T : ViewModel> AppCompatActivity.getViewModel(
//    factory: ViewModelProvider.Factory? = null): T {
//    val myFactory = factory ?: (this as? InjectActivity)?.factory
//    return ViewModelProviders.of(this,
//        myFactory ?: AndroidBaseComponent.viewModelFactory()).get(T::class.java)
//}
//
//inline fun <reified T : ViewModel> Fragment.getViewModel(
//    factory: ViewModelProvider.Factory? = null): T {
//    val myFactory = factory ?: (this as? BaseFragment)?.factory
//    return ViewModelProviders.of(this, myFactory ?: AndroidBaseComponent.viewModelFactory()).get(T::class.java)
//}
//
///**
// * 其他进程获取 viewmodel 的方法1
// * */
//inline fun <reified T : ViewModel> FragmentActivity.getViceViewModel(
//    factory: ViewModelProvider.Factory? = null): T {
//    val myFactory = factory ?: (this as? InjectActivity)?.factory
//    myFactory?.let {
//        return ViewModelProviders.of(this, it).get(T::class.java)
//    }
//    return ViewModelProviders.of(this).get(T::class.java)
//}
//
///**
// * 其他进程获取 viewmodel 的方法2
// * */
//inline fun <reified T : ViewModel> Fragment.getViceViewModel(
//    factory: ViewModelProvider.Factory? = null): T {
//    val myFactory = factory ?: (this as? BaseFragment)?.factory
//    myFactory?.let {
//        return ViewModelProviders.of(this, it).get(T::class.java)
//    }
//    return ViewModelProviders.of(this).get(T::class.java)
//}
