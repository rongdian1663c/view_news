package com.view.news.entity.params

import java.io.Serializable


class LoginParams : Serializable {
    var phone_number: String? = ""
    var validation_code: String? = ""
    var password: String? = ""
    var oauth_expires: String? = ""
    var oauth_token: String? = ""
    var oauth_user_id: String? = ""
    var invite_code: String? = ""
    var device_id: String? = ""
    var os_type: String? = ""
    var login_type: String? = ""
}