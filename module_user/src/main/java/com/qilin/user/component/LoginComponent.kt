package com.qilin.user.component

import com.qilin.core.annotation.ActivityScope
import com.qilin.core.component.AppComponent
import com.qilin.user.ui.login.LoginActivity
import com.qilin.user.ui.login.LoginPhoneFragment
import com.qilin.user.ui.login.LoginUsernameFragment
import dagger.Component
@ActivityScope
@Component(dependencies = [AppComponent::class])
interface LoginComponent {

    @Component.Factory
    interface Factory {
        // Takes an instance of AppComponent when creating
        // an instance of LoginComponent
        fun create(appComponent: AppComponent): LoginComponent
    }
    // This tells Dagger that LoginActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is requesting.
    fun inject(activity: LoginActivity)
    fun inject(activity: LoginUsernameFragment)
    fun inject(activity: LoginPhoneFragment)
}