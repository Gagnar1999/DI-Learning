package org.example.dagger

import dagger.Component

@Component
interface UserRegistrationServiceComponent {

    fun getUserRegistrationService()  : UserRegistrationService

}