package com.qilin.daggerfast

import android.app.Application
import com.qilin.core.utils.CommDaggerUtil

class MyApplication :Application(){
    override fun onCreate() {
        CommDaggerUtil.init()
        super.onCreate()
    }
}
