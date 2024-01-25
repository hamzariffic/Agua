package com.example.agua.Network

import retrofit.GsonConverterFactory
import retrofit2.Retrofit
import kotlin.reflect.KProperty

const val BASE_URL = "/rapidapi.com/"
object APIInstance {
    val api: APIInt by lazy {
        createAPI()
    }
}

private fun Retrofit.Builder.addGsonConverter(): Retrofit.Builder {
    addConverterFactory(GsonConverterFactory.create())
    return this
}

private fun createAPI() : APIInt {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addGsonConverter()
        .build().create(APIInt::class.java)
}
