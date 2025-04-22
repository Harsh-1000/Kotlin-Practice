package kotlincode.coroutines

import kotlinx.coroutines.*

fun main()  = runBlocking {
    println("Main starts on thread: ${Thread.currentThread().name}")

    val job = launch(Dispatchers.Default) {
        println("Coroutine starts on thread: ${Thread.currentThread().name}")

        delay(1000)  // suspends coroutine without blocking the thread

        withContext(Dispatchers.IO) {
            println("Switched to IO thread: ${Thread.currentThread().name}")
            delay(1000)  // again, suspends here too
        }

        println("Back to Default thread: ${Thread.currentThread().name}")
    }

    job.join()

    println("Main ends on thread: ${Thread.currentThread().name}")
}
