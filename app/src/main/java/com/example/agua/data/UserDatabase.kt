//package com.example.agua.data
//
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import io.grpc.Context
//import kotlinx.coroutines.InternalCoroutinesApi
//import kotlinx.coroutines.internal.synchronized
//
////Annotating and specifying the entities
//@Database(entities = [User::class], version = 1, exportSchema = false)
//abstract class UserDatabase: RoomDatabase() {
//    abstract fun userDAO(): UserDao
//    @Volatile
//    private companion object{
//        private var INSTANCE: UserDatabase? = null
//
//        //Check if instance already exists (i.e. != 0)
//        @OptIn(InternalCoroutinesApi::class)
//        fun getDatabase(context: Context): UserDatabase{
//            val instance = INSTANCE
//            if (tempInstance != null){
//                return tempInstance
//            }
//            synchronized(this){
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    UserDatabase::class.java,
//                    "Users"
//                ).build()
//                INSTANCE=instance
//                return instance
//
//            }
//        }
//    }
//}