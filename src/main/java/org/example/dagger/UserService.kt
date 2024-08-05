package org.example.dagger

import javax.inject.Inject

class UserService @Inject constructor() {

    fun storeUser(userName : String, emailId : String){
        println("User Saved in DB")
    }
}