package com.qilin.core.dagger.annotation

import androidx.lifecycle.ViewModel
import dagger.MapKey
import javax.inject.Scope
import kotlin.reflect.KClass

/**
 * 自定义的annotation
 */
// Definition of a custom scope called UserScope
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class UserScope

// Definition of a custom scope called ActivityScope
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)