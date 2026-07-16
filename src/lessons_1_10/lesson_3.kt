fun main() {

    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    // конкатенация строк
    println(greeting +  ", " + userName + "!" + space + "What is your main question?")

    // интерполяция строк
    println("$greeting, $userName! What is your main question?")
    println("To which you can respond ${40 + 2}")

    val multistring = """
                    |aaaaaaa
               |bbbbbbb
                    |cccc
    """.trimMargin()

    println(multistring)

    val phrase = "And he said: \"It is magnificent!\""
    println(phrase)

}