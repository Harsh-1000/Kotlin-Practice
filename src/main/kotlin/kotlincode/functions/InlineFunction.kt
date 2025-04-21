package kotlincode.functions

/**
 * An "inline" function is a function where the function call
 * is replaced by the actual function code at compile time
 *
 * Especially useful with higher-order functions (functions that take lambdas), it
 * Avoids function call overhead
 * Enables non-local returns
 *
 */
fun main(args: Array<String>) {

    calculateTimeAndRun {
        loop(1000000)
    }
}

inline fun calculateTimeAndRun(fn: ()->Unit){
    val start:Long = System.currentTimeMillis()
    fn()
    val end:Long = System.currentTimeMillis()
    println("Time taken ${end-start} ms")
}

fun loop(n:Long){
    for (i in 1..n){
        //
    }
}