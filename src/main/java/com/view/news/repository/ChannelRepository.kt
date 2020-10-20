package com.view.news.repository

import com.view.news.entity.BaseEntity
import com.view.news.entity.ChannelList
import org.springframework.data.jpa.repository.JpaRepository

interface ChannelRepository : BaseEntityRepository<ChannelList>
