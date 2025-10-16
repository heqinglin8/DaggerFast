package com.qilin.core.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qilin.core.CommViewModel
import com.qilin.core.dagger.annotation.ViewModelKey
import com.qilin.core.dagger.viewmodel.AppViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class CommViewModelModule {

    // 绑定 CommViewModel
    @Binds
    @IntoMap
    @ViewModelKey(CommViewModel::class)
    abstract fun bindUserViewModel(vm: CommViewModel): ViewModel

    // 绑定全局工厂
    @Binds
    @Singleton
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}