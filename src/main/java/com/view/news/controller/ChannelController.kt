package com.view.news.controller

import com.view.news.common.ResponseContent
import com.view.news.service.ChannelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping
class ChannelController : BaseController(){
    @Autowired
    var channelService: ChannelService? = null

    @PostMapping("/list")
    fun list() : ResponseContent<*>?{
        return try {
            ResponseContent.buildSuccess("success", channelService?.list())
        }catch (e : Exception){
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }

    @PostMapping("/allList")
    fun allList() : ResponseContent<*>?{
        return try {
            ResponseContent.buildSuccess("success", channelService?.allList())
        } catch (e: Exception) {
            ResponseContent.buildFail("出错啦\n" + e.message)
        }
    }
}