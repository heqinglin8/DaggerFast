package com.qilin.core.component

import com.qilin.core.data.LoginRepository
import com.qilin.core.module.NetworkModule
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun loginRepository(): LoginRepository

}