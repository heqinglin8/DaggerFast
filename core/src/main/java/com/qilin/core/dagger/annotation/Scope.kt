package com.qilin.core.dagger.annotation

import javax.inject.Scope


// Definition of a custom scope called UserScope
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class UserScope

// Definition of a custom scope called ActivityScope
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope