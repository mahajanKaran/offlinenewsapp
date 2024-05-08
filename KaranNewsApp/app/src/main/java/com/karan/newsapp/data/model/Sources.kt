package com.karan.newsapp.data.model

import com.google.gson.annotations.SerializedName
import com.karan.newsapp.data.model.ApiSource

data class Sources(
    @SerializedName("status")
    val status: String,

    @SerializedName("sources")
    val sources: List<ApiSource>
)
