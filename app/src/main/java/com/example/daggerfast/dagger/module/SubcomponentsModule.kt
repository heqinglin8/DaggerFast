package com.example.daggerfast.dagger.module

import com.example.daggerfast.dagger.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
interface SubcomponentsModule {


}