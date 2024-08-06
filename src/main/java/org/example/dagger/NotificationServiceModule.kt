package org.example.dagger

import dagger.Module
import dagger.Provides
import org.example.dagger.annotations.MessageQualifier
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {



    @MessageQualifier
    @Provides
    fun getMessageService(messageService: MessageService): NotificationService{
        return messageService
    }


    @Singleton
    @Named("email")
    @Provides
    fun getEmailService(retryCount : Int) : NotificationService{
        return EmailService(retryCount)
    }
}