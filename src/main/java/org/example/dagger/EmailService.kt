package org.example.dagger

class EmailService {
    fun sendEmail(userName: String, email: String) {
        println("Email send to $email E-Mail ID. for Username-$userName")
    }
}