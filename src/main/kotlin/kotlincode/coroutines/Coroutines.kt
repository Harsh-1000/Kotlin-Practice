package kotlincode.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) : Unit = runBlocking {

    launch {
        takeOrder("Customer 1")
        cookFood("Customer 1")
        deliverIt("Customer 1")

    }

    launch {
        takeOrder("Customer 2")
        cookFood("Customer 2")
        deliverIt("Customer 2")
    }

}

suspend fun takeOrder(name: String){
    println("Order have been taken for $name")
}

suspend fun cookFood(name: String){
    println("Food is cooked for $name")
    delay(4000)
//    Thread.sleep(4000)
}

suspend fun deliverIt(name: String){
    println("Deliver it to the $name")
}
