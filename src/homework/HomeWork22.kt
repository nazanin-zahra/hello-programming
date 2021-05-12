package homework

import java.util.*

object HomeWork22 {

    // برنامه ای بنویسید که 5 عدد از کاربر گرفته و
    //  اگر بیشتر از 10 بودند در لیست higher و در غیر این صورت در لیست lower ثبت کند
    // و در نهایت انها را چاپ کند .
    @JvmStatic
    fun main(args: Array<String>) {
        val a = mutableListOf(11, 5, 7, 15, 20)
        val lower = mutableListOf<Int>()
        val higher = mutableListOf<Int>()
        for (i in 0 until a.size) {
            val item = a[i]
            if (item < 10) {
                lower.add(item)
            } else {
                higher.add(item)
            }
        }
        println("lower: $lower")
        println("higher: $higher")
    }

}

