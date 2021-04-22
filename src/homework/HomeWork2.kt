package homework

import java.util.*

object HomeWork2 {
    @JvmStatic
    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        var sum = 0f

        for (i in 1..n) {
            val s = 1f / i
            sum = sum + s
        }
        println("$sum")

    }


}