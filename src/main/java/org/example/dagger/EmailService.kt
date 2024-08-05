package org.example.dagger

import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(userName: String, email: String) {
        println("Email send to $email E-Mail ID. for Username-$userName")
    }
}