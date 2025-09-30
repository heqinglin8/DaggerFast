package com.qilin.daggerfast.user.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qilin.core.dagger.annotation.ViewModelKey
import com.qilin.core.dagger.viewmodel.AppViewModelFactory
import com.qilin.daggerfast.user.UserViewModel
import com.qilin.daggerfast.user.ui.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class UserViewModelModule {

    // 绑定 MainViewModel
    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel::class)
    abstract fun bindUserViewModel(vm: UserViewModel): ViewModel

    // 绑定 LoginViewModel
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(vm: LoginViewModel): ViewModel

    // 绑定全局工厂
    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}