package com.back.domain.post.post.repository

import com.back.domain.post.post.document.PostDoc
import org.springframework.data.elasticsearch.annotations.Query
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository


interface PostDocRepository : ElasticsearchRepository<PostDoc, String> {
    fun findTopByOrderByIdDesc(): PostDoc?
    fun findByOrderByIdDesc(): List<PostDoc>
    fun findByOrderByIdAsc(): List<PostDoc>


    fun findByTitleContainingOrContentContainingOrderByIdDesc(kw1 : String,kw2: String ):List<PostDoc>


    @Query("{\"query_string\": {\"query\": \"title:*?0* OR content:*?1*\"}}")
    fun findByKw(kw1: String,kw2: String ) : List<PostDoc>
}