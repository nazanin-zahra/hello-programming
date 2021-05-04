package homework

import java.util.*

//لیست nums را دریافت کرده و لیست جدیدی بسازید که هر عضو ان برابر با مجموع عضو صفر تا iام ارایه nums باشد .
object HomeWork26 {
    @JvmStatic
    fun main(args: Array<String>) {
        val nums = mutableListOf<Int>(7, 1, 5, 15)
        println("nums: $nums")
        val out = mutableListOf<Int>()
        var sum = 0
        for (i in 0 until nums.size) {
            sum = sum + nums[i]
            out.add(sum)
        }
        println("out: $out")




    }
}