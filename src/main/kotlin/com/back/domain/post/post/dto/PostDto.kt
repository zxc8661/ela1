package com.back.domain.post.post.dto

import java.time.LocalDateTime

data class PostDto(
    val id: String,
    val createDate: LocalDateTime,
    val modifyDate: LocalDateTime,
    val title: String,
    val content: String,
)