package homework

import java.util.*

object `*HomeWork8` {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        var n = sc.nextInt()
        for (i in 1 ..n.toString().length) {
            val s = n % 10
            println(s)
            n = n / 10
        }
    }
}