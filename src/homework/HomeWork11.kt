package homework

import java.util.*
// برنامه ای بنویسید که n را سوال کرده و n خانه در نظر بگیرد
//و n عدد دلخواه  را یکی یکی سوال کند و داخل انها قرار دهد
//ابتدا میانگین انهارا محاسبه کرده
//و سپس مشخص کند چند عدد از میانگین بزرگترو
//چند عدد کوچکتر و چند عدد با میانگین برابر است.
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
            arr[i] = sc.nextInt()
        }

        // calculate average
        var sum = 0
        for (i in 0..n - 1) {
            sum = sum + arr[i]!!
        }
        val ave = sum / n
        println("Average: $ave")
// finding the greater or smaller words or exact word
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