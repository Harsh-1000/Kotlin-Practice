package kotlincode.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    var one: Int =0
    var two: Int =0

    val time = measureTimeMillis {

//        val one = doSomethingUsefulOne()
//        val two = doSomethingUsefulTwo()
        var job1 = launch {   one = doSomethingUsefulOne() }
        var job2 = launch {   two = doSomethingUsefulTwo() }

        job1.join()
        job2.join()
        println("The answer is ${one + two}")
    }

    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne() : Int{
    delay(1000)
    return 23
}

suspend fun doSomethingUsefulTwo() : Int{
    delay(1000)
    return 27
}