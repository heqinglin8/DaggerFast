package com.qilin.core

import com.qilin.core.utils.CommDaggerUtil
import com.sankuai.waimai.router.annotation.RouterService

@RouterService(interfaces = [BaseModuleLifeCycle::class], key = ["CommModuleLifeCycle"], singleton = true)
class CommModuleLifeCycle: BaseModuleLifeCycle {

    override fun onPrepare() {
        super.onPrepare()
        CommDaggerUtil.init()
    }

}