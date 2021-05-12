package homework

import java.util.*
//برنامه ای که لیست اعداد nums را گرفته و همچنین عدد target  را هم بگیرد
// و index  اعدادی از nums که مجموعه شان برابر با target است را چاپ کند .
object HomeWork23 {
    @JvmStatic
    fun main(args: Array<String>) {
        val nums = mutableListOf(2, 7, 11, 15)
        val target =17
        // target:9 => output: [0, 1]
        // target:18 => output: [1, 2]
        // target:17 => output: [0, 3]
        for (i in 0 until nums.size) {
            val z = target - nums[i]
            for (n in 0 until nums.size) {
                if (z == nums[n]) {
                    println("[$i,$n]")
                    return
                }
            }

        }

    }

}
