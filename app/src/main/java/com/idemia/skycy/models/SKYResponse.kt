package com.idemia.skycy.models

import com.google.gson.annotations.SerializedName

class SKYResponse {
    @SerializedName("title")
    val title: String? = null

    @SerializedName("overview")
    val overview: String? = null

    @SerializedName("duration")
    val duration: String? = null

    @SerializedName("release_year")
    val release_year: String? = null

    @SerializedName("cover_url")
    val cover_url: String? = null

    @SerializedName("id")
    val id: String? = null

    @SerializedName("backdrops_url")
    val backdrops_url: List<String>? = null

}