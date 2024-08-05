package org.example.dagger

import dagger.Component

@Component
interface UserRegistrationServiceComponent {

    fun getUserRegistrationService()  : UserRegistrationService

    fun getEmailService() : EmailService

    fun getUserService() : UserService

    fun inject(mainActivity : MainActivity)

}