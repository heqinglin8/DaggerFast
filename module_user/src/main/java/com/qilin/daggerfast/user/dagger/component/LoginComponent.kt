package com.qilin.daggerfast.user.dagger.component

import com.qilin.core.dagger.annotation.UserScope
import com.qilin.core.dagger.component.AppComponent
import com.qilin.daggerfast.user.LoginActivity
import com.qilin.daggerfast.user.ui.login.LoginPhoneFragment
import com.qilin.daggerfast.user.ui.login.LoginUsernameFragment
import dagger.Component

//@UserScope
//@Component(dependencies = [AppComponent::class])
//interface LoginComponent {
//
//    @Component.Factory
//    interface Factory {
//        // Takes an instance of AppComponent when creating
//        // an instance of LoginComponent
//        fun create(appComponent: AppComponent): LoginComponent
//    }
//    // This tells Dagger that LoginActivity requests injection so the graph needs to
//    // satisfy all the dependencies of the fields that LoginActivity is requesting.
//    fun inject(activity: LoginActivity)
//    fun inject(activity: LoginUsernameFragment)
//    fun inject(activity: LoginPhoneFragment)
//}