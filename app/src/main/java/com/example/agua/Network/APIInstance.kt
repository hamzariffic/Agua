package com.example.agua.Network

import retrofit.GsonConverterFactory
import retrofit2.Retrofit
import kotlin.reflect.KProperty

private val Any.builder: Any
    get() {
        TODO("Not yet implemented")
    }

const val BASE_URL = "/rapidapi.com/"
object APIInstance {
    val api: APIInt by lazy {
        createAPI()
    }
}

private fun Retrofit.Builder.addGsonConverter(): Retrofit.Builder {
    return builder.addConverterFactory(GsonConverterFactory.create())
}

private fun Any.addConverterFactory(create: GsonConverterFactory?): Retrofit.Builder {
    TODO("Not yet implemented")
}

private fun createAPI() : APIInt {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addGsonConverter()
        .build().create(APIInt::class.java)
}
