package com.qilin.core

interface BaseModuleLifeCycle {

    /**
     * before [onInit]
     * 只放模块化的初始化方法，业务初始化使用[onInit]
     */
    fun onPrepare(){}
    /**
     * after [onPrepare]
     * 预加载的业务放在这里面
     */
    fun onInit(){}

}