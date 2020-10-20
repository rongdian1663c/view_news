package com.view.news.repository

import com.view.news.entity.UserInfoEntity

interface LoginRepository : BaseEntityRepository<UserInfoEntity> {
    fun findAllByPhoneNumber(phoneNumber: String?): UserInfoEntity?
}
