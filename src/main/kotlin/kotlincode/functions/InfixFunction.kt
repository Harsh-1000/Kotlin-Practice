package kotlincode.functions

/**
 *  Rules for infix functions: -
 *  Must be a member or extension function
 *  Must have exactly one parameter
 *  Must be marked with the "infix" keyword
 */

fun main(args: Array<String>) {
    val test=Test()
    test infixMethod 5

    val msg = 3 times " yo "

    val pair = "name" to "kotlin"
}

class Test{
    infix fun infixMethod(x:Int){
        println(x)
    }
}

infix fun Int.times(str: String): String = str.repeat(this)

// Let any object of type A pair itself with any object of type B using "to" and return a "Pair"
infix fun<A,B> A.to(that: B): Pair<A,B> = Pair(this,that)