import org.example.dagger.DaggerUserRegistrationServiceComponent
import org.example.dagger.MainActivity


fun main() {

    val instance = MainActivity()
    instance.run()
}

fun bytesToMegabytes(bytes: Long): Long {
    val MEGABYTE = 1024L * 1024L
    return bytes / MEGABYTE
}