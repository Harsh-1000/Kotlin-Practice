package kotlincode.classes

/**
 *  A Class defined inside another class without "inner".
 *  It does not hold a reference to the outer class
 *
 *  use when you want to logically group classes together,
 *  but no access to the outer class is needed
 */

class Outer{

    val name : String = "luffy"
    class Nested {

        fun getName(){
//            println("Hello ji kaisen ba! $name") error
            println("Hello ji kaisen ba!")
        }
    }
}

fun main(args: Array<String>) {
    Outer.Nested().getName()
}