//package com.example.agua.ViewModels
//
//import android.app.Application
//import androidx.lifecycle.AndroidViewModel
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.viewModelScope
//import com.example.agua.data.User
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class UserViewModel(application: Application): AndroidViewModel(application) {
//    private val readAllData: LiveData<List<User>>
////    private val repository: Repo
//
//    //    First executed when the user view model is called
////    These methods only read and add users to the room database
//    init {
//        val userDao = User.getDatabase(Application).Repo()
//        repository = Repo(userDao)
//        readAllData = repository.readAllData
//    }
//    fun addUser(user: User){
//        viewModelScope.launch(Dispatchers.IO){
//            repository.addUser(user)
//        }
//    }
//}
//
//private fun User.Companion.getDatabase(application: Any): Any {
//    TODO("Not yet implemented")
//}
