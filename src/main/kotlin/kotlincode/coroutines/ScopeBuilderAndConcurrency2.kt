package kotlincode.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Main starts on thread: ${Thread.currentThread().name}")
    doWork()
    println("Done on Thread: ${Thread.currentThread().name}")
}

suspend fun doWork() = coroutineScope {
    launch {
        delay(2000)
        println("World 2 on thread: ${Thread.currentThread().name}")
    }

    launch {
        delay(1000)
        println("World 1 on thread: ${Thread.currentThread().name}")
    }

    println("Hello on thread: ${Thread.currentThread().name}")
}