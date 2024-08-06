package org.example.dagger

import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationServiceComponent {

    fun getUserRegistrationService()  : UserRegistrationService

    fun getEmailService() : EmailService

    fun getUserService() : SQLRepository

    fun inject(mainActivity : MainActivity)

}