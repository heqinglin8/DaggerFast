package com.qilin.core.dagger.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider


class AppViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    private val container = HashMap(creators)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        // 先精确匹配
        val creator = container[modelClass]
            ?: container.entries.firstOrNull { modelClass.isAssignableFrom(it.key) }?.value
            ?: throw IllegalArgumentException("Unknown ViewModel class: $modelClass")

        @Suppress("UNCHECKED_CAST")
        return creator.get() as T
    }

    fun add(factory: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>) {
        container.putAll(factory)
    }

    fun remove(modelClass: Class<out ViewModel>) {
        container.remove(modelClass)
    }
}
