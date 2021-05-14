package homework

import java.util.*

//مسعله ای بنویسید که عدد را بگیرد و برعکس کند .
// https://leetcode.com/problems/reverse-integer/
object HomeWork29 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("out: ${reverse(123)}")
        println("out: ${reverse(-123)}")
        println("out: ${reverse(1534236469)}")
        println("out: ${reverse(-2147483648)}")
    }

    fun reverse(x: Int): Int {
        val input = x
        var t = input

        // calculate input length
        var length = 0
        while (t != 0) {
            length += 1
            t /= 10
        }

        // reverse input
        var sum = 0
        t = input
        var position = length
        while (t != 0) {
            position -= 1
            val d = t % 10
            val f: Double = d * Math.pow(10.0, position.toDouble())
            if (Int.MAX_VALUE - f < sum || Int.MIN_VALUE - f > sum) {
                return 0
            }
            sum += f.toInt()
            t /= 10
        }
        return sum
    }
}