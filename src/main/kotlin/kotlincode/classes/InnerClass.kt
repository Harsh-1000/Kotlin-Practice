package kotlincode.classes

class Outer1 {
    val name: String = "luffy"
    inner class Inner{
        fun getName(){
            println("my name is $name")
        }
    }
}

fun main(args: Array<String>) {

    Outer1().Inner().getName()
}