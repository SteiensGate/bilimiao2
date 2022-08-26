package com.a10miaomiao.bilimiao.widget.player

interface VideoPlayerCallBack {
    fun onVideoPause()
    fun onVideoResume(isResume: Boolean)
    fun setStateAndUi(state: Int)
    fun onVideoClose()
}