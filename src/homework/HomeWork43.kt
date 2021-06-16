package homework

import java.util.*

object HomeWork43 {

    // برنامه ای بنویسید که عدد فرد را گرفته
    // و مثلث زیر راچاپ کند. *
    @JvmStatic
    fun main(args: Array<String>) {

        fun farhadMethod(input: Int) {
            for (i in 5 downTo 1) {
                var stars = ""
                for (j in 0 until i) {
                    stars += "*"
                }
                println(stars)
            }
        }
        fun naziMethod(input: Int) {
            var input = 5
            for (i in 1..input) {
                var sum = ""
                var j = input - i
                while (j >= 0) {
                    sum += "*"
                    j -= 1
                }
                println(sum)

            }
        }
    }
}
