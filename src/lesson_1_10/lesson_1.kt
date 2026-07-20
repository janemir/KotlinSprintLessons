//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var numberOfUsers: Int  = 42
    val welcomeMessage: String = "Welcome to our app!"

//    println(numberOfOrders)
    println(welcomeMessage)

    numberOfUsers = 52
    println(numberOfUsers)

    // const val - константа

    // целочисленные
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit
    val unsigned: UInt = 2147483647u // 32 bit

    // вещественные
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 876.3f // 32 bit

    // строковые
    val stringValue: String = "this is string"
    val charValue: Char = '1'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}