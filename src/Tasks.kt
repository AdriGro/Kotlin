import kotlin.system.exitProcess

fun main () {
        identifyNumber(3,4)
        findRating(19)
        envelopeCapacity(4,4,7,7)
        rangeSummary()
        factorialCalculation(3)
        maxOfMultiplicationAndSummary(2,3,4)
        toBinary(10)
    }

    fun identifyNumber (a: Int, b: Int) {
        when ( a % 2 == 0) {
            true -> println(a*b)
            false -> println(a + b)
        }
    }

    fun findRating (rating: Int) {
        when (rating) {
            in 0..19 -> println("F")
            in 20..39 -> println("E")
            in 40..59 -> println("D")
            in 60..74 -> println("C")
            in 75..89 -> println("B")
            in 90..100 -> println("A")
            else -> println("This rating doesn't exist")
        }
    }

    fun envelopeCapacity (firstSide1: Int, secondSide1: Int, firstSide2: Int, secondSide2: Int) {
        if (firstSide1 > firstSide2 && secondSide1 > secondSide2){
            println("The second envelope may be put into the first")
        } else if (secondSide2 > secondSide1 && firstSide2 > firstSide1) {
            println("The first envelope may be put into the second")
        } else {
            println("Sorry, not appropriate parameters")
        }
    }

    fun rangeSummary () {
        var summary = 0
        var evenNumbers = 0
        for (i in 1..99){
            if (i % 2 == 0){ summary += i; evenNumbers++ }
            else { continue }
        }
        println("The summary is $summary")
        println("The amounts of even numbers is $evenNumbers")
    }

    fun factorialCalculation (naturalNumber: Int) {
        var factorial = 1
        if (naturalNumber < 0){
             println("Not a natural number")
        } else if (naturalNumber == 0) {
            println("1")
        } else {
            for (i in 1..naturalNumber) {factorial *= i; println(factorial)}
        }
    }

    fun maxOfMultiplicationAndSummary (firstNumber: Int, secondNumber:Int, thirdNumber: Int)  {
        val sum = {firstNumber: Int, secondNumber: Int, thirdNumber: Int -> firstNumber + secondNumber + thirdNumber}
        val multi = {firstNumber: Int, secondNumber: Int, thirdNumber: Int -> firstNumber * secondNumber * thirdNumber}
        val maxOf = maxOf(sum(firstNumber, secondNumber, thirdNumber), multi(firstNumber, secondNumber, thirdNumber))
        println(maxOf)
    }

    fun toBinary (num: Int) {
        var binary = ""
        var number = num
        while (number != 0) {
            binary += if (number % 2 != 0) {
                "1"
            } else {
                "0"
            }
            number /= 2
        }
        println(binary)
    }
