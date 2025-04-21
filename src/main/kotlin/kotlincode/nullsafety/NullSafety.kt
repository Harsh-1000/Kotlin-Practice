package kotlincode.nullsafety

import java.util.Scanner

/**
 * Null Safety - Nullable & Non-Nullable Types
 * Safe call operator (?.) with let
 * Not Null Asserted (!!) and Elvis Operator (?:)
 *  1. ?
 *  2. ?.
 *  3. ?:
 *  4. !!
 *  let
 *
 *  Safe Cast - the regular kotlin operator for type casts is "as" operator.
 *              However, regular casts can result in an exception if the object
 *              is not of the target type
 *
 *  So you can use " as? " operator for safe caste. It tries to cast a value to the
 *  specified type and returns null if the value is not of that type
 */



fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    var gender: String = "Male"
    var gender2: String? = readlnOrNull()

    gender2?.uppercase()

    gender2!!.uppercase()

    gender2?.let {
        println("line 1")
        println("line 2")
        println("line 3")
    }

    var selectedValue: String = gender2 ?: "NA"

    // safe cast
    val a: Any = "Hello, Luffy!"

    val aInt: Int? = a as? Int

    val aString : String? = a as? String

    println(aInt)
    println(aString)

}
