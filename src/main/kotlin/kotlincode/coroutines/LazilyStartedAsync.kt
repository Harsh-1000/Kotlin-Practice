package kotlincode.coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Optionally, async can be made lazy by setting its start parameter to CoroutineStart.LAZY.
 * In this mode it only starts the coroutine when its result is required by await, or
 * if it's Job's start function is invoked.
 */

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY){ doSomethingXOne() }
        val two = async(start = CoroutineStart.LAZY){ doSomethingXTwo() }

        one.start() // start the first one
        two.start() // start the second one

        println("the answer is ${one.await()+two.await()}")

    }

    println("complete in $time ms")
}

suspend fun doSomethingXOne() : Int{
    delay(1000)
    return 23
}

suspend fun doSomethingXTwo() : Int{
    delay(1000)
    return 27
}