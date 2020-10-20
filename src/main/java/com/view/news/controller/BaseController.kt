package com.view.news.controller


import com.view.news.entity.user.TokenInfo
import com.view.news.utils.TokenInfoHolder


open class BaseController {

    /**
     * 获取当前登陆的用户信息
     * @return
     */

            // getTokenInfo() 方法名
            // : 后面 TokenInfo 指返回值
    fun getTokenInfo(): TokenInfo? = TokenInfoHolder.tokenInfo



}