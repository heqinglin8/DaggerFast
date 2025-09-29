package com.qilin.daggerfast.user.modulization

import com.qilin.daggerfast.user.utils.UserDaggerUtil

class UserModuleApiImpl {

    init {
        UserDaggerUtil.inject(this)
    }

}