package org.example.dagger

import javax.inject.Inject

class MainActivity {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    lateinit var messageService: MessageService
    lateinit var messageService1: MessageService

    fun run() {
        println("Running Our Main Activity")

        val component1 = DaggerUserRegistrationServiceComponent.factory().create(3)

        component1.inject(this)

        val component2 = DaggerUserRegistrationServiceComponent.factory().create(3)

        component2.inject(this)
        messageService = component2.getMessageService()
        messageService1 = component2.getMessageService()
        println(messageService)
        println(messageService1)
        userRegistrationService.registerUser("gagan", "Gagannarang1999@gmail.com")

        println("Ending our Main Activity")
    }
}