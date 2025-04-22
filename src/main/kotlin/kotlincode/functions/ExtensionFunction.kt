package kotlincode.functions

fun main(args: Array<String>) {
    println("One Piece".formattedString())

    val a : Int = 5

    println(a.addOne())
}

fun String.formattedString(): String{
    return "----------\n$this\n----------"
}

fun Int.addOne() : Int{
    return this + 1
}