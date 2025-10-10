package com.qilin.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.qilin.core.utils.CommDaggerUtil
import javax.inject.Inject

open class InjectActivity: AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        CommDaggerUtil.inject(this)
        super.onCreate(savedInstanceState)
    }

}