package homework

import java.util.*

object HomeWork32 {

    // عدد  n  را بگیرد و طول ان را برگرداند .
    @JvmStatic
    fun main(args: Array<String>) {
        println(" out:${position(432)}")
    }

    fun position(n: Int): Int {
        var t = n
        var out = 0
        while (t > 0) {
            t%10
            out += 1
            t = t / 10

        }
        return out
    }
}

