package com.qilin.daggerfast.dagger.module

import com.qilin.user.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
interface SubcomponentsModule {


}