package com.back.domain.post.post.controller

import com.back.domain.post.post.document.PostDoc
import com.back.domain.post.post.dto.PostDto
import com.back.domain.post.post.service.PostDocService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts/search")
class ApiV1PostSearchController(
    private val postDocService: PostDocService
) {
    @GetMapping
    fun getItems(
        @RequestParam(defaultValue = "") kw :String
    ): List<PostDto> {
        if(kw.equals("")) {
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
        }else{
            return postDocService
                .findByKw(kw)
                .map{
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

    @GetMapping("/{id}")
    fun getItem(
        @PathVariable(value = "id") id :String
    ): PostDoc {
        return postDocService
            .findById(id)
    }

}