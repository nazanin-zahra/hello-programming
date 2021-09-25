package homework

import java.util.*
//الگوریتمی بنویسید که یک لیست n عنصری زوج را در نظر گرفته باشد
//و n عدد در ان ذخیره کند .
//عنصر اول با عنصر اخر؛و عنصر دوم را با عنصر یکی مانده به اخر ؛ جمع کند و نشان دهد.
object HomeWork12 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()

        if (n % 2 == 1) {  // odd
            println("you must enter an even number")
            main(args)
        } else {
            //get number
            val arr = arrayOfNulls<Int>(n)
            for (i in 0..n - 1) {
                print("Enter ${i + 1}:")
                arr[i] = sc.nextInt()
            }

            for (i in 0 until n / 2) {
                val b = arr[i]!! + arr[n - i - 1]!!
                println(b)
            }
        }
    }
}


