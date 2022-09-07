package homework

import java.util.*

object `*HomeWork9` {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n : ")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        for (i in 0 until n) {
            arr[i] = sc.nextInt()
        }
        for (j in n - 1 downTo 0) {
            println(arr[j])
        }
    }
}