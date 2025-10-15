package com.qilin.daggerfast.user.dagger.component

import com.qilin.core.dagger.annotation.ModuleScope
import com.qilin.core.dagger.component.AppComponent
import com.qilin.daggerfast.user.biz.data.user.LoginRepository
import com.qilin.daggerfast.user.module.UserNetworkModule
import com.qilin.daggerfast.user.module.UserViewModelModule
import com.qilin.daggerfast.user.ui.login.LoginViewModelFactory
import dagger.Component

@ModuleScope
@Component(dependencies = [AppComponent::class], modules = [UserNetworkModule::class, UserViewModelModule::class])
interface UserComponent {

    @Component.Factory
    interface Factory {
        // Takes an instance of AppComponent when creating
        // an instance of LoginComponent
        fun create(appComponent: AppComponent): UserComponent
    }

    fun provideViewModuleFactory(): LoginViewModelFactory

    fun loginRepository(): LoginRepository

    // This tells Dagger that UserModuleApiImpl requests injection so the graph needs to
    // satisfy all the dependencies of the fields that UserModuleApiImpl is requesting.
//    fun inject(userModule: UserModuleApiImpl)

//    fun inject(activity: UserActivity)

}