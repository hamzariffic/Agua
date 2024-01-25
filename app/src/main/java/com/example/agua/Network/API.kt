package com.example.agua.Network

import com.example.agua.data.User
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit2.http.GET

interface APIInt {
//    suspend fun getData() : Call<List<User>>
    @GET("/ManniskaMaskin/api/storm-glass")
    suspend fun getData() : List<User>

    companion object : APIInt {
        private var apiInstance:APIInt? = null

        suspend fun  getData () : APIInt{
            if (apiInstance == null){
                apiInstance = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(APIInt!!::class.java)
            }
            return apiInstance!!
        }
    }
}