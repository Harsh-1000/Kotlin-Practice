package kotlincode.classes

/**
 * Object Expression
 * Anonymous Object using object keyword.4
 * Replacement of Java's Anonymous Inner Class
 */

fun main(args: Array<String>) {

    val testObj = object {
        val x : Int = 10
        fun method(){
            println("I am object Expression")
        }
    }

    testObj.method()


    var obj = object : Cloneable{
        override fun clone() {
           println("I am clone")
        }

    }

    obj.clone()

    var obj2 = object : Human("Monke.D.Luffy"){
        override fun humanFullName() {
            super.humanFullName()
            println("Anonymous - $name")
        }
    }

    obj2.humanFullName()
}

interface Cloneable{
    fun clone()
}

open class Human(val name: String){
    open fun humanFullName() = println("Full Name - $name")
}