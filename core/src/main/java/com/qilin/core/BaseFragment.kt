package com.qilin.core

import androidx.fragment.app.Fragment

class BaseFragment:Fragment() {

    val baseActivity: InjectActivity
        get() = requireActivity() as InjectActivity

//    val factory by lazy {
//        baseActivity.factory
//    }

}