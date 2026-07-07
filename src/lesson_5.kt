fun main() {

    val userAge = readln().toInt()

    val resultText = if(userAge >= AGE_OF_MAJORITY_) {
        "Show special content"
    } else if(userAge == 16 || userAge == 17) {
        "Show limited content"
    } else {
        "Back to the main screen"
    }
//    println(resultText)

    val consoleNumber = when(userAge){
        10 -> {
            println("Additional action")
            "Your number is 10"
        }
        20 -> "Your number is 20"
        67 -> "Your number is 67"
        else -> "Another number"
    }
    println(consoleNumber)
}

const val AGE_OF_MAJORITY_ = 18