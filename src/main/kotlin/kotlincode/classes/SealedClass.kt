package kotlincode.classes

// a sealed class is a special kind of class used to represent a restricted hierarchy
// - all its subclasses defined in the same class

fun main(args: Array<String>) {

    val s1 = Circle(5.0)
    val s2 = Rectangle(3.0,4.0)
    val s3 = NoShape

    printShapeInfo(s1)
    printShapeInfo(s2)
    printShapeInfo(NoShape)

    // 2nd example
    val loadState = getLoadStateSealed(LoadStateSealed.Success("connected"));
    println(loadState)
}

//sealed class Shape{
//    class Circle(val radius: Double) : Shape()
//    class Rectangle(val width: Double, val height: Double) : Shape()
//    object NoShape : Shape()
//}
// OR
sealed class Shape

class Circle(val radius: Double) : Shape()
class Rectangle(val width: Double, val height: Double) : Shape()
object NoShape : Shape()

fun printShapeInfo(shape: Shape){
    when(shape){
        is Circle -> println("Circle with radius ${shape.radius}")
        is Rectangle -> println("Rectangle with width ${shape.width} " +
                "and height ${shape.height}")
        NoShape -> println("No Shape")
    }
}

//second example

sealed class LoadStateSealed {
    data class Success(val data: String) : LoadStateSealed()
    data class Failure(val t: Throwable) : LoadStateSealed()
    object LoadingState :LoadStateSealed()
}

fun getLoadStateSealed(loadSate: LoadStateSealed): Any{
    return when(loadSate){
        is LoadStateSealed.Failure -> loadSate.t
        LoadStateSealed.LoadingState -> {}
        is LoadStateSealed.Success -> loadSate.data
    }
}