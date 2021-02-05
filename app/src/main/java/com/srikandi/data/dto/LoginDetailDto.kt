package com.srikandi.data.dto

data class LoginDetailDto(
    val token: String = "",
    val userId: Long = 0,
    val username: String = "",
    val firstName: String = "",
    val lastName: String = ""
)