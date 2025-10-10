package com.qilin.daggerfast.user.dagger.component

import com.qilin.core.dagger.annotation.UserScope
import com.qilin.core.dagger.component.AppComponent
import com.qilin.daggerfast.user.UserActivity
import com.qilin.daggerfast.user.module.UserViewModelModule
import dagger.Component

@UserScope
@Component(dependencies = [AppComponent::class], modules = [UserViewModelModule::class])
interface UserComponent {

    @Component.Factory
    interface Factory {
        // Takes an instance of AppComponent when creating
        // an instance of LoginComponent
        fun create(appComponent: AppComponent): UserComponent
    }
    // This tells Dagger that UserModuleApiImpl requests injection so the graph needs to
    // satisfy all the dependencies of the fields that UserModuleApiImpl is requesting.
//    fun inject(userModule: UserModuleApiImpl)

//    fun inject(activity: UserActivity)

}