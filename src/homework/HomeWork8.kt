package homework

import java.util.*

object HomeWork8 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val line = sc.nextLine()
        val n=line.toInt()


        var t = n
        for (i in 0 until line.length) {
            val r = t % 10
            println("$r")
            t = t / 10
        }
    }
}


