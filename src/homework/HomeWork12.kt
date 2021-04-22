package homework

import java.util.*

object HomeWork12 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()

        if (n % 2 == 1) {
            println("you must enter an even number")
            main(args)
        } else {
            val arr = arrayOfNulls<Int>(n)
            for (i in 0..n - 1) {
                print("Enter ${i + 1}:")
                arr[i] = sc.nextInt()
            }

            for (i in 0 until n / 2) {
                val b = arr[i]!! + arr[n - i - 1]!!
                println(b)
            }
        }
    }
}


