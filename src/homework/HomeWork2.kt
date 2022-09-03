package homework

import java.util.*

object HomeWork2 {
    @JvmStatic
    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        var sum = 0f

        for (i:Int  in 1.rangeTo(n)) {
            val s = 1f / i
            sum = sum + s
        }

        //     (1..n).forEach{i:Int ->
        //      val s=1f/i
        //   sum=sum+s
        //}
        println("$sum")

    }


}