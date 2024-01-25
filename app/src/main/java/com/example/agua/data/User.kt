package com.example.agua.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val description: String,
    val age: Int
) {
    companion object
}