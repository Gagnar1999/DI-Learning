package org.example.dagger

/*
    Issues with this class
    * Violations of SOLID Principles,
    * Lifetime of UserService and EmailService Object
    * Unit Testing (To test User Registration We first have to create userService and EmailService
    * Extend functionality Issue
 */

class UserRegistrationService(
    private val userService: UserService, private val emailService: EmailService
) {


    fun saveUserAndSendEmail(userName: String, email: String) {
        userService.storeUser(userName, email)
        emailService.sendEmail(userName, email)
    }
}