package com.qilin.daggerfast

import android.app.Application
import com.qilin.daggerfast.dagger.component.DaggerApplicationComponent
import com.qilin.user.component.LoginComponent
import com.qilin.user.provider.LoginComponentProvider

class MyApplication : LoginComponentProvider,Application(){
    val appComponent = DaggerApplicationComponent.create()
    override fun onCreate() {
        super.onCreate()
    }

    override fun provideLoginComponent(): LoginComponent {
        return appComponent.loginComponent().create()
    }
}
