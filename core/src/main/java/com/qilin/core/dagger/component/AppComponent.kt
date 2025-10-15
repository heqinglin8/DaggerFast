package com.qilin.core.dagger.component

import com.qilin.core.InjectActivity
import com.qilin.core.InjectComponentActivity
import com.qilin.core.module.CommViewModelModule
import com.qilin.core.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, CommViewModelModule::class])
interface AppComponent :AndroidBaseComponent{

    fun inject(activity: InjectActivity)

    fun inject(activity: InjectComponentActivity)

}