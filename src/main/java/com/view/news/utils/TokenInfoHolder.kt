package com.view.news.utils


import com.view.news.entity.user.TokenInfo

/**
 * @description 保持session在ThreaLocal中
 */
object TokenInfoHolder {

    private val TOKEN_INFO_THREAD_LOCAL = InheritableThreadLocal<TokenInfo>()

    var tokenInfo: TokenInfo
        get() = TOKEN_INFO_THREAD_LOCAL.get()
        set(tokenInfo) = TOKEN_INFO_THREAD_LOCAL.set(tokenInfo)

    fun clearTokenInfo() {
        TOKEN_INFO_THREAD_LOCAL.remove()
    }

}