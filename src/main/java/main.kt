import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.example.dagger.UserRegistrationService

fun main(){
    val userRegService = UserRegistrationService()
    userRegService.saveUserAndSendEmail("Gagnar1999", "gagannarang1999@gmail.com")
}