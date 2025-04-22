package kotlincode.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new Coroutine and Continue
        delay(1000L) // non-blocking delay for 1 second
        println("Monkey.D.Luffy") // print after delay
    }
    println("One Piece") // main coroutine continues while previous one is delayed
}