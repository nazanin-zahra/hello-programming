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

        val t = n / 10    //12345
        val ten = t % 10
        println("$ten")

        val b = t / 10   //1234
        val hundred = b % 10
        println("$hundred")

        val m = b / 10  //123
        val thousand = m % 10
        println("$thousand")


        val oneHundredThousand = m / 10   //12
        println("$oneHundredThousand")

    }


}


