package com.qilin.daggerfast.user.utils

import com.qilin.core.utils.CommDaggerUtil
import com.qilin.daggerfast.user.UserActivity
import com.qilin.daggerfast.user.dagger.component.DaggerUserComponent
import com.qilin.daggerfast.user.dagger.component.UserComponent

object UserDaggerUtil {

    private lateinit var userComponent: UserComponent

    fun init(){
        userComponent = DaggerUserComponent.factory().create(CommDaggerUtil.appComponent)
    }

//    fun inject(userModule: UserModuleApiImpl) = userComponent.inject(userModule)

    fun inject(activity: UserActivity) = userComponent.inject(activity)

}