package com.example.agua.Network

import retrofit2.Retrofit

const val BASE_URL = "/rapidapi.com/"
object APIInstance {
    val api: APIInt by lazy {
        createAPI()
    }
}
private fun addGsonConverter(): Retrofit.Builder {
    return Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(addGsonConverter.create())
}


private fun createAPI() : APIInt {
    return addGsonConverter()
        .baseUrl(BASE_URL)
        .build().create(APIInt::class.java)
}
