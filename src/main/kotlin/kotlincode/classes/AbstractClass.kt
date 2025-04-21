package kotlincode.classes

fun main(args: Array<String>) {

    val dog = Dog()

    dog.makeSound()
    dog.sleep()

    //Load State example
    val status = getLoadState(Success("successful"))
    println(status)

}

abstract class Animal {

    abstract fun makeSound()

    fun sleep() = println("Sleeping...")
}

class Dog : Animal(){
    //    override fun makeSound() {
//      println("Woof! Woof!")
//    }
    override fun makeSound()  =  println("Woof! Woof!")
}

// second example
abstract class LoadState

data class Success(val data:String) : LoadState()
data class Failure(val t:Throwable) : LoadState()
object Loading : LoadState()

fun getLoadState(loadState: LoadState): Any{
    return when(loadState){
        is Success -> loadState.data
        is Failure -> loadState.t
        Loading -> {}
        else -> {}
    }
}

