package org.example.dagger

import dagger.Module
import dagger.Provides
import org.example.dagger.annotations.MessageQualifier
import javax.inject.Named

@Module
class NotificationServiceModule() {



    @MessageQualifier
    @Provides
    fun getMessageService(messageService: MessageService): NotificationService{
        return messageService
    }


    @Named("email")
    @Provides
    fun getEmailService(retryCount : Int) : NotificationService{
        return EmailService(retryCount)
    }
}