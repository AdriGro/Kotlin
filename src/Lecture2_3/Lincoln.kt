package Lecture2_3

import java.util.*

fun main () {

            var a: Int
            var c = 0
            val scn = Scanner(System.`in`)
            if (scn.hasNextInt()) {
                a = scn.nextInt()
                while (a != 0) {
                    c += a % 10
                    a /= 10
                }
                println("The sum is $c")
            } else println("Error. Try again")
        }
