fun main() {

    val a = 5
    val b = 7
    val sum = a + b
    val c1 = 888
    val c2: Int

//    println(sum)
//    println(10 / 3)

    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2) // 3

    val floatNum1: Float = 10.0f
    val floatNum2: Float = 3.0f
    println(floatNum1 / floatNum2) // 3.3333333

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2) // 3.3333333333333335

    val complexExpression = (a + b) * 2 - 4 / 2
    println(complexExpression) // 22

    // остаток от деления
    println(10 % 3) // 1

    // конечный тип переменной

    val f = intNum1 + floatNum1
    println(f::class.java.simpleName) // float

    val f1 = intNum1 + floatNum1 + doubleNum1
    println(f1::class.java.simpleName) // double

    // инкремент, декремент

    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

    println(counter) // 3

    counter -= 1
    counter--

    // операторы сравнения
    // a = 5, b = 7

    println(a > b) // false
    println(a < b) // true
    println(a >= b) // false
    println(a <= b) // true
    println(a == b) // false
    println(a != b) // true
}