package kotlincode.classes

fun main(args: Array<String>) {

    val user1 = User("Monkey.D.Luffy","luffy@gmail.com")
    val user2 = user1.copy()

    println(user2)
}

data class User(val username: String, val email:String)

// perfect for modeling immutable data like API responses, user data etc