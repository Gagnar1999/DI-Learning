package org.example.dagger

import org.example.dagger.annotations.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

/*
    Issues with this class
    * Violations of SOLID Principles,
    * Lifetime of UserService and EmailService Object
    * Unit Testing (To test User Registration We first have to create userService and EmailService
    * Extend functionality Issue
 */
/*
    * We Use Modules when there are three situations    (Till Now)
        1. When we are injecting interface
        2. When we are injecting abstract class
        3. When we have to use builder patter for object creation
 */
class UserRegistrationService @Inject constructor(
    private val userService: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {


    fun registerUser(userName: String, email: String) {
        userService.saveUser(userName, email)
        notificationService.send(email, "Gagan", "Hi, My Name is Gagan!! Welcome to learning series of dagger")
    }
}