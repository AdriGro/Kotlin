package Lecture1_1

import java.util.*

fun main () {

    val answers = listOf("Yes", "No", "Likely yes", "Likely no", "Here is some potential",
        "Incorrect form of the question")

    do {
        println("Ask a question")
        val scan = Scanner(System.`in`)
        val n = scan.nextLine()
        if (n == "") {
            break
        }
        val randomAnswer = (0..5).random()
        println(answers[randomAnswer])
    }
    while(n != "")
}
