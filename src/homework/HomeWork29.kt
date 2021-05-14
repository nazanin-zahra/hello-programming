package homework

import java.util.*
import kotlin.math.pow

//مسعله ای بنویسید که عدد را بگیرد و برعکس کند .
object HomeWork29 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = 543765876
        var t = input

        // calculate input length
        var length = 0
        while (t > 0) {
            length += 1
            t /= 10
        }

        // reverse input
        var sum = 0
        t = input
        var position = length
        while (t > 0) {
            position -= 1
            val d = t % 10
            val f = d * 10f.pow(position).toInt()
            sum += f
            t /= 10
        }
        println("out: $sum")


    }
}