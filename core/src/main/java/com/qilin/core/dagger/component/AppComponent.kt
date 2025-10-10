package com.qilin.core.dagger.component

import androidx.lifecycle.ViewModelProvider
import com.qilin.core.InjectActivity
import com.qilin.core.data.user.LoginRepository
import com.qilin.core.module.CommViewModelModule
import com.qilin.core.module.NetworkModule
import dagger.Binds
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, CommViewModelModule::class])
interface AppComponent {

    fun loginRepository(): LoginRepository

    fun inject(activity: InjectActivity)

}