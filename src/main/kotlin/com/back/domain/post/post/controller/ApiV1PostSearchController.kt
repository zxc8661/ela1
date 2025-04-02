package com.back.domain.post.post.controller

import com.back.domain.post.post.dto.PostDto
import com.back.domain.post.post.service.PostDocService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts/search")
class ApiV1PostSearchController(
    private val postDocService: PostDocService
) {
    @GetMapping
    fun getItems(): List<PostDto> {
        return postDocService
            .findByOrderByIdAsc()
            .map {
                PostDto(
                    id = it.id,
                    createDate = it.createDate,
                    modifyDate = it.modifyDate,
                    title = it.title,
                    content = it.content
                )
            }
    }
}