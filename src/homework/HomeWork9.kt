package homework

import java.util.*
//۳ عدد گرفته و از اخر به اول چاپ کن
object HomeWork9 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("Enter n:")
        val n = sc.nextInt()

//        val a = sc.nextInt()
//        val b = sc.nextInt()
//        val c = sc.nextInt()

        val arr = arrayOfNulls<Int>(n)
        for (i in 0 until n) {
            arr[i] = sc.nextInt()
        }

//        println(c)
//        println(b)
//        println(a)

        for (i in n - 1 downTo 0) {
            println(arr[i])
        }
    }
}


