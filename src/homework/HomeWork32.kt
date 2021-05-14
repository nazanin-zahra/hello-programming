package homework

import java.util.*

object HomeWork32 {

    // عدد  n  را بگیرد و طول ان را برگرداند .
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 64783554
        var t = n
        var out = 0
        val z = t % 10
        while (t > 0) {
            z
            out += 1
            t = t / 10

        }
        println("Out: $out")
    }
}

