package com.qilin.daggerfast.user

import android.util.Log
import com.qilin.core.BaseModuleLifeCycle
import com.qilin.daggerfast.user.utils.UserDaggerUtil
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [BaseModuleLifeCycle::class], key = ["UserModuleLifeCycle"], singleton = true)
class UserModuleLifeCycle: BaseModuleLifeCycle {
    companion object{
        const val TAG = "UserModuleLifeCycle"
    }
    override fun onPrepare() {
        super.onPrepare()
        Log.d(TAG,"onPrepare before dagger init")
        UserDaggerUtil.init()
        Log.d(TAG,"onPrepare after dagger init")
    }

}