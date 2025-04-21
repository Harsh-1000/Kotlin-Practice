package kotlincode.functions

fun main(args: Array<String>) {

    val lambda : (Int,Int) -> Int = {x:Int,y:Int -> x+y}

    val multiLineLambda: () -> Int = {
        println("Hello lambda")
        val a :Int = 2+3
        a
    }

    multiLineLambda()

    val singleParamLambda = {x:Int -> x*x}

    val lambdaSquare: (Int)->Int = { x -> x*x}

    println( lambdaSquare(2))

    val singleParam: (Int) -> Int = {x -> x+x}
    val simplifyLambda : (Int) -> Int = {it + it}

//    calculator(2,3,{a,b -> a+b})
    calculator(2,3) { a, b -> a + b }
}

// normal func

fun sum(a: Int, b: Int) : Int{
    return a+b
}

// lambda expression
val sum = {a:Int, b:Int -> a+b}

fun calculator(a: Int, b:Int, op:(Int,Int) -> Int):Int{
    return op(a,b)
}

//Anonymous function
//like a lambda , but with more traditional function syntax
val multiply = fun (x:Int, y:Int): Int {return x*y}