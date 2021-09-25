package homework

import java.util.*
//الگوریتمی بنویسید که عدد طبیعی n را دریافت
//و ارایه ای به طول n را در نظر بگیرد و n مقدار را سوال کند
// و داخل ان ذخیره کند و مقدار target را سوال نموده و
//بگوید target  چندمین عدد وارد شده است
//(فرض بر یکتا بودن ورودی هاست)
//و اگر target بین عدد نبود  بگه؛not found
object HomeWork14 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n: ")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        //get number
        for (i in 0..n - 1) {
            print("Enter $i: ")
            arr[i] = sc.nextInt()
        }
        //get target to find the index of target in array
        print("Enter target: ")
        val target = sc.nextInt()
        var targetIndex: Int? = null
        for (i in 0 until n) {
            if (target == arr[i]) {
                targetIndex = i
            }
        }

        if (targetIndex != null) {
            println(targetIndex)
        }else{
            println("Not found")
        }
    }
}

