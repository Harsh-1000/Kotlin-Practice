package kotlincode.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * A coroutineScope builder can be used inside any suspending function to perform
 * multiple concurrent operations.
 *
 * Let's launch two concurrent coroutines inside a doWorld suspending function
 */

//Sequentially executes doWorld followed by "Done"

fun main() = runBlocking {
    doWorld()
    println("Done")
}

//Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope

    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}