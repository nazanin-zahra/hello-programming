package homework

import java.util.*

object HomeWork20 {
    @JvmStatic
    //الگوریتمی بنویسد که n را گرفته و فاکتوریل  ان را باز گرداند.
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("Enter n:")
        val n = sc.nextInt()
        val factorial = factorial(n)
        println("$n! = $factorial")

    }

    fun factorial(m: Int): Int {
        var sum = 1
        for (i in 0 until m - 1)
            sum = (m - i) * sum
        return sum
    }
}