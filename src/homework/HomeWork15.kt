package homework

import java.util.*
//الگوریتمی بنویسید که لیست arr به طول n را در نظر گرفته
//و n عدد را خوانده و اعمال زیر را انجام دهد
//اگر عدد زوج بود ان را ذخیره کند و در غیر این صورت دو برابر ان را ذخیره کند
//و بعد لیست arrرا چاپ کند.
object HomeWork15 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n: ")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        //get number
        for (i in 0 until n) {
            print("Enter $i: ")
            arr[i] = sc.nextInt()
        }


        // changes in  numbers
        var s: Int? = null
        for (i in 0 until n) {
            s = arr[i]
            if (s!! % 2 == 0) { // even
                println("#$i:${arr.get(i)}")
            } else {  //odd
                println("#$i:${s * 2}")
            }
// i used a new val (s) because if i wanted to use arr[i], i could use *
            //because it is not allowed to use with arr[i]
        }
    }

}




