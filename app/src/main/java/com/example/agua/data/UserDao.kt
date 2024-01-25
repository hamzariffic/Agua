package com.example.agua.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    //    Inserting data
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    //    Reading all data
    @Query("SELECT * From Users Order by id ASC")
    fun readAllUsersData(): LiveData<List<User>>
}