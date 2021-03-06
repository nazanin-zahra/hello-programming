package homework

import java.util.*
// اعداد p,m را گرفته و عدد m به توان p و m*pرا محاسبه و چاپ کند
//با تابع و اسمع تابع power باشد .
object HomeWork21 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter m: ")
        val m = sc.nextInt()
        print("Enter p: ")
        val p = sc.nextInt()

        val power = power(m, p)
        println("$m^$p= $power")

        val multiplication = multiplication(m, p)
        println("$m*$p= $multiplication")
    }

    fun power(m: Int, p: Int): Int {
        var sum = 1
        for (i in 1..p) {
            sum = sum * m
        }
        return sum
    }

    fun multiplication(a: Int, b: Int): Int {
        var sum = 0
        var i = 1
        while (i <= b) {
//            sum = sum + a
            sum += a
            i += 1
        }
        return sum
    }
}