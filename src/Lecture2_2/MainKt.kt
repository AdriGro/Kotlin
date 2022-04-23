package Lecture2_2

fun main () {

    val randomValue = (5..155).random()
    println(randomValue)
    val interval = 25..100

    if (interval.contains(randomValue)) {
        println("Contains")
    } else {
        println("Doesn't contains")
    }
}