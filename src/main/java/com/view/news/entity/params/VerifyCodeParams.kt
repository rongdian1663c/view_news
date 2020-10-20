package com.view.news.entity.params


class VerifyCodeParams {
    var validation_code_type: String = ""
    var validation_code: String? = ""
    var zone_code: String? = "" // 国家代码 中国 86
    var phone_number: String? = ""
}