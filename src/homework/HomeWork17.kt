package homework

import java.util.*

object HomeWork17 {
    // الگروریتمی بنویسید که عدد n را گرفته و یک آرایه‌ی n عضوی بسازد و n عدد را دریافت کند
    // و در ارایه ذخیره کند و چاپ گند
    //قبل از چاپ ؛ یکتا بودن (تکراری نبودن) اعداد را چک کند.
    //(فقط اعداد یکتا را چاپ کند)
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
            val candidate = arr[i]!!
            var existed = false
            for (j in 0 until i) {
                if (arr[j] == candidate) {
                    existed = true
                }
            }
            if (existed.not())
                println("#$i: ${arr[i]} ")
        }
    }
}
