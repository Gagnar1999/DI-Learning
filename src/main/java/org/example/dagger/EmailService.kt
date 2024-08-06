package org.example.dagger

import javax.inject.Inject

interface NotificationService{
    fun  send(to : String, from : String, body : String)
}

class EmailService(private val retryCount : Int) : NotificationService{

    override fun send(to: String, from: String, body: String) {
        println("Email Sent")
    }
}


class MessageService @Inject constructor() : NotificationService{
    override fun send(to: String, from: String, body: String) {
        println("Message Sent")
    }

}