package homework

import java.util.*

object HomeWork30 {

    // عدد n را گرفته و مجموع ارقام ان را محاسبه کند .
    @JvmStatic
    fun main(args: Array<String>) {
        println("${calculater(123) }")
    }
    fun calculater(n:Int):Int{
        var t = n
        var sum = 0
        while (t > 0) {
            sum = sum + (t % 10)
            t = t / 10
        }
        return  sum
    }

}

