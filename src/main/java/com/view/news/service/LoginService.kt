package com.view.news.service

import com.view.news.entity.UserInfoEntity
import com.view.news.repository.LoginAuthRepository
import com.view.news.repository.LoginRepository
import com.view.news.utils.NickNameUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class LoginService {

    @Autowired
    var loginRepository: LoginRepository? = null

    @Autowired
    var loginAuthRepository: LoginAuthRepository? = null

    fun getUserInfo(phoneNumber: String?): UserInfoEntity? {
        return loginRepository?.findAllByPhoneNumber(phoneNumber)
    }

    fun getToken(userId: Long?): String? {
        return loginAuthRepository?.getToken(userId)
    }

    /**
     * 创建用户
     * @param userOpenInfo
     * @return
     */
    fun getOrCreateByOpenUser(phoneNumber: String?): UserInfoEntity {
        val userInfo = UserInfoEntity()
        userInfo.expiryTime = Date(System.currentTimeMillis() + 180L)
        userInfo.avatar = "https://pandachatfs.liaoyantech.cn/img/fb4204a48b0e5ebd"
        userInfo.phoneNumber = phoneNumber
        userInfo.nickName = NickNameUtil.getRandomName(6)
        loginRepository?.save(userInfo)
        return userInfo
    }

}
