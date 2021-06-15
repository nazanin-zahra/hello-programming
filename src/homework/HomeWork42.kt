package homework

import java.util.*

object HomeWork42 {

    // الگوریتمی بنویسید که n عدد صعودی را خوانده و
    // در یک لیست قرار دهدو سپس عددی راخوانده و
    // محل ان را در لیست مشخص کند
    //(با فرض اینکه اعداد ذخیره شده در لیست تکراری نباشد )
    @JvmStatic
    fun main(args: Array<String>) {
        val input = listOf<Int>(1, 15, 20, 25, 30)
        val x = 201
        var a = 0
        var b = input.size - 1
        var condition = false
        while (!condition) {
            val middle = (b + a) / 2
            when {
                input[middle] == x -> {
                    println("out:$middle")
                    condition = true
                }

                input[middle] != x -> {
                    condition = true
                    println("out:${-1}")
                }

                input[middle] > x -> {
                    a = 0
                    b = middle - 1
                }

                input[middle] < x -> {
                    a = middle + 1
                    b = input.size - 1
                }
            }
        }
    }
}
