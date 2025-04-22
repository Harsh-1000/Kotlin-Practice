package kotlincode.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Conceptually, async is just like launch. It starts a separate coroutine which is a light-weight thread
 * that works concurrently with all the other coroutines. The difference is that launch returns a Job and
 * does not carry any resulting value, while async returns a Deferred — a light-weight non-blocking future
 * that represents a promise to provide a result later.
 * You can use .await() on a deferred value to get its eventual result,
 * but Deferred is also a Job, so you can cancel it if needed.
 */

fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async { doSomethingOne() }
        val two = async { doSomethingTwo() }
//        one.cancel() Deferred cancelled
        println("The answer is ${one.await() + two.await()}")
    }

    println("completed in time $time ms")
}
suspend fun doSomethingOne() : Int{
    delay(1000)
    return 23
}

suspend fun doSomethingTwo() : Int{
    delay(1000)
    return 27
}