package homework

import java.util.*

object HomeWork5 {
    @JvmStatic
    fun main(args: Array<String>) {
      val sc= Scanner(System.`in`)
        print("Enter n:")
        val n= sc.nextInt()
        var sum= 0
        for (w in 6.rangeTo(n) step (6)){
           sum=sum+w




        }
        print("$sum")


    }


}