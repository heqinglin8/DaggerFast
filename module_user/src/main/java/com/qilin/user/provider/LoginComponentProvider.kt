package com.qilin.user.provider

import com.qilin.user.component.LoginComponent

interface LoginComponentProvider {
    fun provideLoginComponent(): LoginComponent
}