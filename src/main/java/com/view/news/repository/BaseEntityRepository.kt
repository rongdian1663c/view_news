package com.view.news.repository


import com.view.news.entity.BaseEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean


@NoRepositoryBean
interface BaseEntityRepository<T : BaseEntity> : JpaRepository<T, Long> {

//    fun findByDeleted(deleted: Boolean): List<T>
//
//    fun findByDeleted(deleted: Boolean, pageable: Pageable): Page<T>

    fun findOneById(id: Long?): T

}
