package kotlincode.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.withTimeout

suspend fun main() {
    withTimeout(1300){
        repeat(1000){
            i ->
            println("I am sleeping $i ...")
            delay(500)
        }
    }

}