package com.idemia.skycy.models

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.io.IOException

class SKYApi {
    fun getMovies(): List<SKYResponse>? {
        val httpRequestGet = HttpRequestGet()

        httpRequestGet.start()
        try {
            httpRequestGet.join()
            httpRequestGet.interrupt()
            val resp = httpRequestGet.response
            if (resp!!.code() == 200) {

                var itemType = object : TypeToken<List<SKYResponse>>() {}.type
                var gson = GsonBuilder().create()
                return gson.fromJson(resp.body()!!.string(), itemType)
            }
        } catch (exception: InterruptedException) {
            exception.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }

    companion object {
        private var instance: SKYApi? = null
        private const val url = ""
        fun getInstance(): SKYApi {
            return (if (instance == null) SKYApi() else instance.also { instance = it })!!
        }
    }
}