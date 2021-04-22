package homework

import java.util.*

object HomeWork4 {
    @JvmStatic
    fun main(args: Array<String>) {

        val sc= Scanner(System.`in`)
        print ("Enter n:")
        val n= sc.nextInt()
        var sum=0

        for (z in 2..n step (2)){
            sum=sum+z



        }
        print("$sum")


    }


}