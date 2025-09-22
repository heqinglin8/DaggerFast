package com.qilin.daggerfast.dagger.component

import com.qilin.daggerfast.dagger.module.NetworkModule
import com.qilin.daggerfast.dagger.module.SubcomponentsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
interface ApplicationComponent {

    //让ApplicationComponent知道如何获取到LoginComponent
    //can use it to obtain new instances of LoginComponent
    fun loginComponent(): LoginComponent.Factory

}