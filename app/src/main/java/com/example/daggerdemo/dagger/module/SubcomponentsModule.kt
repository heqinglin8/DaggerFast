package com.example.daggerdemo.dagger.module

import com.example.daggerdemo.dagger.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
interface SubcomponentsModule {


}