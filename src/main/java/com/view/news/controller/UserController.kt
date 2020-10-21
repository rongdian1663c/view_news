package com.view.news.controller

import com.view.news.common.ResponseContent
import com.view.news.entity.ChannelList
import com.view.news.entity.UserInfoListEntity
import com.view.news.entity.params.ListParams
import com.view.news.repository.ChannelRepository
import com.view.news.service.ChannelService
import com.view.news.service.UserService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/user")
class UserController : BaseController() {

    private val logger = LoggerFactory.getLogger(UserController::class.java)

    @Autowired
    var userService: UserService? = null

    @GetMapping("/info/{userId}")
    fun userInfo(@PathVariable("userId") userId: String): ResponseContent<*>? {
        return try {
            ResponseContent.buildSuccess("success", userService?.getUserInfo(userId.toLong()))
        } catch (e: Exception) {
            logger.error("error", e)
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }

    @GetMapping("/follow/{followUserId}")
    fun follow(@PathVariable("followUserId") followUserId: String): ResponseContent<*>? {
        return try {
            ResponseContent.buildSuccess("success", userService?.follow(followUserId.toLong()))
        } catch (e: Exception) {
            logger.error("error", e)
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }

    @GetMapping("/cancelFollow/{followUserId}")
    fun cancelFollow(@PathVariable("followUserId") followUserId: String): ResponseContent<*>? {
        return try {
            ResponseContent.buildSuccess("success", userService?.cancelFollow(followUserId.toLong()))
        } catch (e: Exception) {
            logger.error("error", e)
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }

    /**
     * 通过userId查询关注的用户信息列表
     */
    @PostMapping("/followList")
    fun followList(@RequestBody params: ListParams): ResponseContent<*>? {
        return try {
            ResponseContent.buildSuccess("success", UserInfoListEntity(userService?.followList(params.user_id?.toLong())))
        } catch (e: Exception) {
            logger.error("error", e)
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }

    @PostMapping("/fansList")
    fun fansList(@RequestBody params: ListParams): ResponseContent<*>? {
        return try {
            ResponseContent.buildSuccess("success", UserInfoListEntity(userService?.fansList(params.user_id?.toLong())))
        } catch (e: Exception) {
            logger.error("error", e)
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }
}
