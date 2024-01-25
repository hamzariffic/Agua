//package com.example.agua.Repo
//
//import com.example.agua.data.User
//import com.google.common.io.Files
//
//private val KtorClient.Companion.httpClient: Any
//    get() {
//        TODO("Not yet implemented")
//    }
//
//private fun Any.use(block: Function1<*, *>): User {
//    TODO("Not yet implemented")
//}
//
//class KtorClient {
//    companion object
//    object userRepo {
//        suspend fun getUserDetails(): com.example.agua.data.User {
//            return KtorClient.httpClient.use(){
//                it.get("https://jsonplacejolder.typicode.com/todos/1")
//            }
//        }
//        suspend fun postUserDetails(){
//            return KtorClient.httpClient.use(){
//                it.post("https://jsonplacejolder.typicode.com/todos/1"){
//                    var body = mapOf("A" to "1")
//
//                    headers {
//                        Files.append("key", "value")
//                    }
//                }
//            }
//        }
//
//}
