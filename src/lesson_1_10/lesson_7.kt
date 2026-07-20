fun main() {

    val range1: IntRange = 67..667
    val range2: IntRange = 67 until 667
    val range3: LongRange = 67L .. 667L
    val range4: CharRange = 'a'.. 'z'
    val range5: ClosedRange<Double> = 67.1 .. 667.1
    val range6: ClosedRange<Float> = 67.1f .. 667.1f
    val range7: IntProgression = 67..667 step 2
    val range8: IntProgression = 667 downTo 67 step 2

    val a = 52 in range1
    val b = 52 !in range1
//    println(a)
//    println(b)

    for (i in 5 downTo 1) {
        if (i == 3) {
//            println("Пользователь нажал на кнопку \"Пропустить\"")
//            break
//            println("i == 3, i не будет распечатана")
//            continue
            return
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }

    println("Продолжение работы программы вне цикла")

//    for (i in range2 step 8) {
//        println(i)
//    }





}