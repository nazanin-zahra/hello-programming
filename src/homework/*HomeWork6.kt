package homework

import java.util.*

object `*HomeWork6` {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        (1..n).forEach { i ->
            if (n % i == 0) {
                println("$i \n\n")
            }
        }
    }
}