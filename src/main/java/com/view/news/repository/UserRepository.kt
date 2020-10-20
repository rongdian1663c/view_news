package com.view.news.repository

import com.view.news.entity.ContentBean
import com.view.news.entity.UserInfoEntity

interface UserRepository : BaseEntityRepository<UserInfoEntity> {
    fun findUserById(id: Long?): UserInfoEntity?
}
