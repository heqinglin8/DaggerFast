package com.example.daggerdemo.dagger.component

import com.example.daggerdemo.dagger.module.NetworkModule
import com.example.daggerdemo.dagger.module.SubcomponentsModule
import com.example.daggerdemo.ui.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
interface ApplicationComponent {

    //让ApplicationComponent知道如何获取到LoginComponent
    //can use it to obtain new instances of LoginComponent
    fun loginComponent(): LoginComponent.Factory

}