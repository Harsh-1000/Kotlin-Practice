package kotlincode.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
  launch {
      doWorld1()
  }
    println("One Piece")

}

suspend fun  doWorld1(){
    delay(1000L)
    println("Monkey.D.Luffy")
}