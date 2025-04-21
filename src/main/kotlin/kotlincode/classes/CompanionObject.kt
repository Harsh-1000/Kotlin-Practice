package kotlincode.classes

fun main(args: Array<String>) {
    MyClass.MyObject.f()
    MyClass.g()
}

class MyClass{
    object MyObject {
        @JvmStatic
        fun f(){
            println("Hello I am F from Object")
        }
    }

    companion object AnotherObject{
        fun g(){
            println("Hello I am G from Another Object")
        }
    }
}