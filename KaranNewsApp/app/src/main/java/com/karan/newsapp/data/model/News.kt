package com.karan.newsapp.data.model

import com.google.gson.annotations.SerializedName
import com.karan.newsapp.data.model.ApiArticle

data class News(
    @SerializedName("status")
    val status: String,

    @SerializedName("totalResults")
    val totalResults: Int,

    @SerializedName("articles")
    val articles: List<ApiArticle>
)