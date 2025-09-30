package com.qilin.core.dagger.component

import com.qilin.core.data.user.LoginRepository
import com.qilin.core.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun loginRepository(): LoginRepository

}