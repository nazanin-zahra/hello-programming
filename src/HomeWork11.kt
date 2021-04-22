package homework

import java.util.*

object HomeWork11 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)

        // get numbers and store
        for (i in 0 until n) {
            print("Enter ${i + 1}:")
            val enteredInt = sc.nextInt()
            arr[i] = enteredInt
        }

        // calculate average
        var sum = 0
        for (i in 0..n - 1) {
            sum = sum + arr[i]!!
        }
        val ave = sum / n
        println("Average: $ave")

        var greater = 0
        var smaller = 0
        var exactword = 0

        for (k in 0..n - 1) {
            if (arr[k]!! > ave) {
                greater = greater + 1
            } else if (arr[k]!! < ave) {
                smaller = smaller + 1
            } else {
                exactword = exactword + 1
            }
        }
        println("Greater number:$greater")
        println("smaller number:$smaller")
        println("Exact word:$exactword")
    }
}




