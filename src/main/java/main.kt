import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.example.dagger.EmailService
import org.example.dagger.UserRegistrationService
import org.example.dagger.UserService

fun main() {
    val userService = UserService()
    val emailService = EmailService()

    val userRegService = UserRegistrationService(userService, emailService)

    userRegService.saveUserAndSendEmail("Gagnar1999", "gagannarang1999@gmail.com")
}