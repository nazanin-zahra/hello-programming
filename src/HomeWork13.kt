package homework

import java.util.*

object HomeWork13 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        for (i in 0..n - 1) {
            print("Enter${i + 1}:")
            arr[i] = sc.nextInt()
        }
        print("Enter target:")
        val target = sc.nextInt()
        var sum = 0
        for (i in 0 until n) {
            if (target == arr[i]) {
                sum = sum + 1
            }
        }
        println("number of $target is $sum")
    }
}

