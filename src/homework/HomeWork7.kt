package homework

import java.util.*

object HomeWork7 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()

        val one = n % 10
        println("$one")

        val t = n / 10
        val ten = t % 10
        println("$ten")

        val b = t / 10
        val hundred = b % 10
        println("$hundred")

        val m = b / 10
        val thousand = m % 10
        println("$thousand")

        val z = m / 10
        val oneHundredThousand = m / 10
        println("$oneHundredThousand")

    }


}


