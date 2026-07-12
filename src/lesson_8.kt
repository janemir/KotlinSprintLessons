fun main() {

    val ingredient1 = "яйцо"
    val ingredient2 = "помидор"
    val ingredient3 = "зелень"
    val ingredient4 = "соль"
    val ingredient5 = "перец"

    val arrayOfIngredients: Array<String> = arrayOf("яйцо", "помидор", "злень", "соль", "перец")

    val intArray1: IntArray = intArrayOf(5, 6, 7)
    val charArray1: CharArray = charArrayOf('5', '6', '7')

//    val intArray2 = arrayOf()

    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(1, 2, 3, 4, 5)

//    println("Размер массива с ингредиентами: ${arrayOfIngredients.size}")

//    println(arrayOfIngredients.indexOf("помидор"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])
//    println(arrayOfIngredients[7]) // error

//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])

    arrayOfIngredients.set(1, "капуста")
    arrayOfIngredients.get(1)

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}