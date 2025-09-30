package com.qilin.daggerfast

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.qilin.core.BaseModuleLifeCycle
import com.qilin.core.utils.CommDaggerUtil
import com.sankuai.waimai.router.Router
import com.sankuai.waimai.router.common.DefaultRootUriHandler
import com.sankuai.waimai.router.common.PageAnnotationHandler
import com.sankuai.waimai.router.core.Debugger

class MyApplication :Application(){

    companion object{
        /**
         * SCHEMA
         */
        //默认对外的SCHEMA（固定tt，跳转的时候会把下发的URI替换成tt）
        const val SCHEME = "tt"

        //内部组件之间跳转的SCHEMA = "tt_router"
        const val SCHEMA_INTERNAL = PageAnnotationHandler.SCHEME

        /**
         * HOST
         */
        //默认对外的HOST，针对后台下发的运营URI跳转（固定m.52tt.com，跳转的时候会把下发的URI替换成m.52tt.com）
        const val HOST = "m.52tt.com"

        //内部组件之间跳转的，内部页面跳转，用于代替原有的显式跳转，实现工程解耦HOST = "page"
        const val HOST_INTERNAL = PageAnnotationHandler.HOST
    }

    override fun onCreate() {
        CommDaggerUtil.init()
        initRouter(this)
        Router.getAllServices(BaseModuleLifeCycle::class.java).apply {
            this.forEach {
                it.onPrepare()
            }
        }
        Router.getAllServices(BaseModuleLifeCycle::class.java).apply {
            this.forEach {
                it.onInit()
            }
        }
        super.onCreate()
    }

    @SuppressLint("StaticFieldLeak")
    private fun initRouter(context: Context) { // 自定义Logger

        // 调试开关，建议测试环境下开启。调试模式下，严重问题直接抛异常，及时暴漏出来。
        Debugger.setEnableDebug(true)
        // 创建RootHandler
        val rootHandler = DefaultRootUriHandler(context, SCHEME, HOST)

        // 初始化
        Router.init(rootHandler)

        // 懒加载后台初始化（可选），
        // 由于handler和里面使用了注入，必须放在这里，邓dango初始化之后才能调用
//        TDispatchers.compute.launch {
//            Router.lazyInit()
//        }
    }
}
