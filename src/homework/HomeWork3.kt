package homework

import java.util.*

object HomeWork3 {
    @JvmStatic
    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        var sum=0f

        for ( m in 3..n step (3)){
            val k= 1f/m
            sum = sum+k

        }
         println("$sum")




    }


}