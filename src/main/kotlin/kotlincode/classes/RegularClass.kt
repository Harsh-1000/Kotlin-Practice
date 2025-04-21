package kotlincode.classes

fun main(args: Array<String>) {

    val person = Person("Monkey.D.Luffy",20);
    person.greet()
}

class Person(val name: String, var age: Int){
    fun greet(){
        println("Hello, my name is $name and I'm $age years old")
    }
}