package com.qilin.core.dagger.component

import androidx.lifecycle.ViewModelProvider

interface AndroidBaseComponent {
    fun viewModelFactory(): ViewModelProvider.Factory
}