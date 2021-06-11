package homework

import java.util.*

object HomeWork41 {

    // برنامه ای که لیستی از اعداد را گرفته
    // و عددی که بیشترین تکرار را دارد را چاپ کند
    @JvmStatic
    fun main(args: Array<String>) {
        val input = listOf<Int>(1, 2, 1, 3, 2, 2, 1, 3, 1)
        var big = 0
        var mostRepeated = 0

        for (i in 0 until input.size) {
            var repeated = 0
            for (j in 0 until input.size) {
                if (input[i] == input[j]) {
                    repeated += 1
                }
            }
            if (repeated > mostRepeated) {
                mostRepeated = repeated
                big = input[i]
            }
        }
        println("out:$big")
    }
}

