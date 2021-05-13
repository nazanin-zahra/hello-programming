package homework

import java.util.*

object HomeWork30 {

    // عدد n را گرفته و مجموع ارقام ان را محاسبه کند .
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n: ")
        val n = sc.nextInt()
        var t = n
        var sum = 0
        while (t > 0) {
            sum = sum + (t % 10)
            t = t / 10
        }
        println("out: $sum")
    }

}

