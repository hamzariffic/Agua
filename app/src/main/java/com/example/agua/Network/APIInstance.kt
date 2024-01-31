package com.example.agua.Network

import retrofit.GsonConverterFactory
import retrofit2.Retrofit

const val BASE_URL = "/rapidapi.com/"
object APIInstance {
    val api: APIInt by lazy {
        createAPI()
    }
}
private fun addGsonConverter(): Retrofit.Builder {
    return Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
}


//Clean up this code and remove duplicate classes
private fun Retrofit.Builder.addConverterFactory(create: GsonConverterFactory?): Retrofit.Builder {
    TODO("Not yet implemented")

}


private fun createAPI() : APIInt {
    return addGsonConverter()
        .baseUrl(BASE_URL)
        .build().create(APIInt::class.java)
}
