package homework

import java.util.*

object HomeWork31 {

    // الگوریتمی  بنویسید که تعداد ارقام زوج و فرد عددn را حساب کند .
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n: ")
        val n = sc.nextInt()
        var t = n
        var even = 0
        var odd = 0
//        var s = 0
        while (t > 0) {
            val s = t % 10
            if (s % 2 != 0) {
                odd += 1
            } else {
                even += 1
            }
            t /= 10
        }
        println("even: $even")
        print("odd: $odd")


    }
}

