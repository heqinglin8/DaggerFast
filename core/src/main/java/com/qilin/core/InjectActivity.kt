package com.qilin.core

import androidx.appcompat.app.AppCompatActivity
import com.qilin.core.dagger.component.AndroidBaseComponent

class InjectActivity:AppCompatActivity() {

    val factory by lazy {
        AndroidBaseComponent.viewModelFactory()
    }

}