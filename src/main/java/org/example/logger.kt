package org.example

import kotlinx.coroutines.delay
import java.time.LocalTime
import java.util.Calendar

/*
    Prints message on console with the current message with time as well
 */
fun log(message : Any){
    println("${Thread.currentThread()} ----> $message")
}

/*
`   Prints the time on console after 10 seconds delay
 */
suspend fun printTimeInfinitely(){
    while (true){
        log(LocalTime.now())
        delay(100)
    }
}