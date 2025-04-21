package kotlincode.functions

fun main(args: Array<String>) {
    println("One Piece".formattedString())
}

fun String.formattedString(): String{
    return "----------\n$this\n----------"
}