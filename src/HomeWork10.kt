package homework

import java.util.*

object HomeWork10 {
    @JvmStatic
    fun main(args: Array<String>) {


        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        val arr = arrayOfNulls<String>(n)
        for (b in 0 until n) {
            val name = sc.next()
//            arr[b] = name
            arr.set(b, name)
        }

        for (h in n - 1 downTo 0) {
//            println(arr[h])
            println(arr.get(h))
        }
    }
}



