package com.example.agua.Network

import com.example.agua.data.User
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit2.http.GET

interface APIInt : List<User> {
//    suspend fun getData() : Call<List<User>>
    @GET("/ManniskaMaskin/api/storm-glass")
    suspend fun getData() : List<User>

    companion object : APIInt {
        private var apiInstance:APIInt? = null

        override suspend fun  getData() : List<User> {
            if (apiInstance == null){
                apiInstance = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(APIInt::class.java)
            }
            return apiInstance!!
        }
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun get(index: Int): User {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<User> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<User> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<User> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<User> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: User): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: User): Int {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<User>): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: User): Boolean {
        TODO("Not yet implemented")
    }
}