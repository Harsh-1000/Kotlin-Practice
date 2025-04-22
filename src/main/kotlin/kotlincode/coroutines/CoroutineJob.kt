package kotlincode.coroutines

import kotlinx.coroutines.*
import kotlin.concurrent.thread

/**
 * What's going on step-by-step:
 * 1. val job = launch { ... }
 * Launches a new coroutine inside the runBlocking scope
 * It starts running independently, like a background task
 * job is a handle (reference) to that coroutine — it’s like your remote control to manage it (pause, cancel, wait, etc.)
 * 2. println("Hello")
 * This runs immediately, while the coroutine launched above is still sleeping (due to delay(1000L))
 * 3. job.join()
 * This is the key part:
 * 🔑 join() suspends the current coroutine until the coroutine referenced by job is finished
 * It’s Kotlin’s coroutine-friendly way of saying:
 * “Hey, wait for that coroutine to complete before moving on, but don’t block the thread — just suspend me.”
 * 4. After 1 second, the launched coroutine resumes
 * It prints "World!"
 * Now job is complete
 * 5. Then the suspended main coroutine (inside runBlocking) resumes
 * It prints "Done"
 */
fun main() = runBlocking{
    val job = launch {
        thread {
            println("hello-thread-inside-launch : ${Thread.currentThread().name}")
        }
        delay(5000)
        println("World!")
    }

    Thread {
        println("hello-thread : ${Thread.currentThread().name}")
    }.start()

    println("Hello")
    job.cancel() // cancels the job
    job.join() // wait until child coroutines completes
    job.cancelAndJoin()
    println("Done")
}