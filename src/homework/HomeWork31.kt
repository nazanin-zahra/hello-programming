package homework

import java.util.*

object HomeWork31 {

    // الگوریتمی  بنویسید که تعداد ارقام زوج و فرد عدد n  را حساب کند .
    // tip:اگه ستا چیز خواستی توی ی کیسه میگی tree pel
    @JvmStatic
    fun main(args: Array<String>) {
         val result=evenodd(123)
        println("even:${result.first}")
        println("odd:${result.second}")
    }

    fun evenodd(n: Int): Pair<Int,Int> {
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
        return Pair(even,odd)


    }
}

