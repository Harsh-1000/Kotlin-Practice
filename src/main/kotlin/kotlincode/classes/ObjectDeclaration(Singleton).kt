package kotlincode.classes

fun main(args: Array<String>) {

    println(A.num)
    B.test()

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()
}

object SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = fbLikes++
    fun display() = println("Facebook - $fbLikes -- Twitter - $twitterLikes")

}

//object declaration

object A{
    val num: Int = 10
}

object B{
    val p: Int = 20
    fun test(){
        println("I am object B")
    }
}