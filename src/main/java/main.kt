import org.example.dagger.DaggerUserRegistrationServiceComponent


fun main() {
    val component = DaggerUserRegistrationServiceComponent.create()
    val userRegistrationService = component.getUserRegistrationService()

    userRegistrationService.registerUser("Gagnar1999", "gagannarang1999@gmail.com")
    println("Helll")
}