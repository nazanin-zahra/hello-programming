package homework

import java.util.*

object HomeWork16 {
    // لیستی به طول n را در نظر بگیرد و n تا عدد را بخواند و عمل زیر را انجام دهد
    // اگر عدد زوج بود خود عدد و در غیر اینصورت دوبرابر آن را چاپ کند
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n: ")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        for (i in 0 until n) {
            print("Enter $i: ")
            arr[i] = sc.nextInt()
        }

        for (i in 0 until n) {
            val s = arr[i]!!

            if (s % 2 == 0) {
                println("#$i :$s")
            } else {
                println("#$i :${s * 2}")
            }
        }
    }
}
