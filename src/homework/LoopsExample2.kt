package homework

import java.util.*

object LoopsExample2 {
    @JvmStatic
    fun main(args: Array<String>) {
//        for(i in 0..5)
//            print("$i   "  )

        val sc = Scanner(System.`in`)
        print("Please enter n:")
        val n: Int = sc.nextInt()
        var sum = 0

        for (n2 in 0..n) {
            sum = sum + n2

        }
        print("$sum   ")


    }
}