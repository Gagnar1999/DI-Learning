package org.example.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("email")
    @Provides
    fun getNotificationService() : NotificationService{
        return EmailService()
    }

    @Named("message")
    @Provides
    fun getEmailService(messageService: MessageService): NotificationService{
        return messageService
    }
}