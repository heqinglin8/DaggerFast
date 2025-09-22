package com.qilin.daggerfast.dagger.component

import com.qilin.daggerfast.dagger.annotation.ActivityScope
import com.qilin.daggerfast.ui.login.LoginActivity
import com.qilin.daggerfast.ui.login.LoginPhoneFragment
import com.qilin.daggerfast.ui.login.LoginUsernameFragment
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