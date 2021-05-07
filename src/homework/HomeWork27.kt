package homework

import java.util.*


object HomeWork27 {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = mutableListOf<Int>(1, 1, 1, 1)
        for (i in 0 until num.size) {
            for (j in i + 1 until num.size) {
                if (i < j) {
                    if (num[i] == num[j]) {
                        print("($i,$j)")
                    }
                }

            }
        }
    }
}