package lesson_13

fun main() {

    val nullableString: String? = null
//    val nonNullableString: String = "some string"

//    println(nullableString?.length)
//    println(nonNullableString.length)

//    if(nullableString != null) println(nullableString.length)
//    else println("Переменная хранит null")

//    val nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 999
//    println(stringLength)

    val stringLength: Int = nullableString!!.length
}