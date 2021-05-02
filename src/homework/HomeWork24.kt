package homework

import java.util.*

object HomeWork24 {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = mutableListOf(11, 5, 7, 15, 20)
        val lower = mutableListOf<Int>()
        val higher = mutableListOf<Int>()
        for (i in 0 until a.size) {
            val item = a[i]
            if (item < 10) {
                lower.add(item)
            } else {
                higher.add(item)
            }
        }
        println("lower: $lower")
        println("higher: $higher")
    }

}

