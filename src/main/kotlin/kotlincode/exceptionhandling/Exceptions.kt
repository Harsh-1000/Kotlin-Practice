package kotlincode.exceptionhandling

/**
 * Kotlin does not have checked exceptions so there is no concept of throws
 *
 * only - try, catch, finally, throw
 */
fun main(args: Array<String>) {
    val arr: Array<Int> = arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (e:Exception){
        println(e.message)
    }
    finally {
        println("I will execute no matter what")
    }

    println("This will not run")

    createUserList(2)
    createUserList(-8)
}

fun createUserList(count: Int){
    if (count<0)
    {
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User list created containing $count users")
    }
}