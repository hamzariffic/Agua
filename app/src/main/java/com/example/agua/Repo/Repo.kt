//package com.example.agua.Repo
//
//import com.google.common.io.Files.append
//
//object userRepo {
//    suspend fun getUserDetails(): com.example.agua.data.User {
//        return KtorClient.httpClient.use(){
//            it.get("https://jsonplacejolder.typicode.com/todos/1")
//        }
//    }
//    suspend fun postUserDetails(){
//        return KtorClient.httpClient.use(){
//            it.post("https://jsonplacejolder.typicode.com/todos/1"){
//                var body = mapOf("A" to "1")
//
//                headers {
//                    append("key", "value")
//                }
//            }
//        }
//    }