package com.qilin.core.dagger.component

import androidx.lifecycle.ViewModelProvider

interface AndroidBaseComponent {

    fun viewModelFactory(): ViewModelProvider.Factory

    companion object {
        private lateinit var instance: AndroidBaseComponent

        fun injectComponent(instance: AndroidBaseComponent) {
            AndroidBaseComponent.instance = instance
//            BaseComponent.injectComponent(instance)
        }

        fun viewModelFactory(): ViewModelProvider.Factory {
            return instance.viewModelFactory()
        }

    }

}