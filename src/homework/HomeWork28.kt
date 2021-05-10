package homework

import java.util.*

//لیست nums را دریافت کرده و لیست جدیدی بسازید که هر عضو ان برابر با مجموع عضو صفر تا iام ارایه nums باشد
// این برای مسعله ۲۶ بود
// مسعله ۲۶ را طوری حل کنید که هر عضو ؛مجموعخانه ها با دو زوج قبلی باشد
object HomeWork28 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = mutableListOf<Int>(3, 7, 20, 5, 12, 8)
        println("input: $input")
        val out = mutableListOf<Int>()
        var sum = 0
        for (i in 0.rangeTo(input.size - 1)) {

            if (input[i].rem(2) == 0) {
                sum = sum + input[i]
            }
            out.add(sum)
        }
        println("out: $out")
    }
}