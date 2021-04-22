package homework

import java.util.*

object HomeWork14 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n: ")
        val n = sc.nextInt()
        val arr = arrayOfNulls<Int>(n)
        for (i in 0..n - 1) {
            print("Enter $i: ")
            arr[i] = sc.nextInt()
        }
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

