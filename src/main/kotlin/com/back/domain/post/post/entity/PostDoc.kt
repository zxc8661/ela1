package com.back.domain.post.post.entity

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import java.time.LocalDateTime

@Document(indexName = "app1_posts")
data class PostDoc(
    @Id
    @Field(type = FieldType.Keyword)
    val id: String,

    @Field(type = FieldType.Date, format = [], pattern = ["yyyy-MM-dd'T'HH:mm:ss.SSSSSS"])
    val createDate: LocalDateTime,

    @Field(type = FieldType.Date, format = [], pattern = ["yyyy-MM-dd'T'HH:mm:ss.SSSSSS"])
    val modifyDate: LocalDateTime,

    @Field(type = FieldType.Text, analyzer = "nori")
    var title: String,

    @Field(type = FieldType.Text, analyzer = "nori")
    var content: String,
)