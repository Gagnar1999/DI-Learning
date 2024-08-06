package org.example.dagger

import javax.inject.Inject

class MainActivity {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    fun run() {
        println("Running Our Main Activity")

        val component = DaggerUserRegistrationServiceComponent.factory().create(3)

        component.inject(this)
        userRegistrationService.registerUser("gagan", "Gagannarang1999@gmail.com")

        println("Ending our Main Activity")
    }
}