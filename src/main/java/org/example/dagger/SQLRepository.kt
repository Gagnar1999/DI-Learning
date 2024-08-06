package org.example.dagger

import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {


    override fun saveUser(email: String, password: String) {
        println("User Saved in Local Storage")
    }
}

class FirebaseRepository: UserRepository{

    override fun saveUser(email: String, password: String) {
        println("User Saved in Firebase Storage.")
    }

}