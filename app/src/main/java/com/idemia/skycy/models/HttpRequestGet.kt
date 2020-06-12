package com.idemia.skycy.models

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.util.concurrent.TimeUnit

class HttpRequestGet() : Thread() {
    var response: Response? = null
        private set

    override fun run() {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(180, TimeUnit.SECONDS)
            .readTimeout(180, TimeUnit.SECONDS)
            .writeTimeout(180, TimeUnit.SECONDS)
            .build()
        val request = Request.Builder()
            .url("https://sky-exercise.herokuapp.com/api/Movies")
            .get()
            .build()
        try {
            response = okHttpClient.newCall(request).execute()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    companion object {
        private val JSON =
            MediaType.parse("application/json; charset=utf-8")
    }

}