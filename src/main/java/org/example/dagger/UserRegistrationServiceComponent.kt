package org.example.dagger

import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationServiceComponent {

    fun getUserRegistrationService()  : UserRegistrationService


    fun getUserService() : SQLRepository

    fun inject(mainActivity : MainActivity)


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount : Int): UserRegistrationServiceComponent
    }

}