package com.example.daggerfast.dagger.component

import com.example.daggerfast.dagger.annotation.ActivityScope
import com.example.daggerfast.ui.login.LoginActivity
import com.example.daggerfast.ui.login.LoginPhoneFragment
import com.example.daggerfast.ui.login.LoginUsernameFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {
   //告诉Dagger如何创建 LoginComponent的实例。
    @Subcomponent.Factory
//    @Subcomponent.Builder
    interface Factory {
        fun create(): LoginComponent
    }
    // This tells Dagger that LoginActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is requesting.
    fun inject(activity: LoginActivity)
    fun inject(activity: LoginUsernameFragment)
    fun inject(activity: LoginPhoneFragment)
}