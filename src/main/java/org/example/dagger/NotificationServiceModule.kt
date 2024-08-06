package org.example.dagger

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getNotificationService() : NotificationService{
        return EmailService()
    }

}