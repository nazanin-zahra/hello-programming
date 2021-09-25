package homework

import java.util.*
//الگوریتمی بنویسید که عدد طبیعی n را دریافت و
//ارایه ای به طول n در نظر بگیرد و n مقدار را سوال کند
//و داخل ان ذخیره کند و سپس مقدار target را سوال نموده
//و محاسبه کند مقدار target با چند عضو ارایه برابر است.
object HomeWork13 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        //get number
        for (i in 0..n - 1) {
            print("Enter${i + 1}:")
            arr[i] = sc.nextInt()
        }
        //finding the numbers which are similar to target
        print("Enter target:")
        val target = sc.nextInt()
        var sum = 0
        for (i in 0 until n) {
            if (target == arr[i]) {
                sum = sum + 1
            }
        }
        println("number of $target is $sum")
    }
}

