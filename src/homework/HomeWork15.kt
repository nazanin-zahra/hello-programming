package homework

import java.util.*

object HomeWork15 {
    @JvmStatic
    fun main(args: Array<String>) {
      val sc=Scanner(System.`in`)
        print("Enter n: ")
        val n=sc.nextInt()
        val arr= arrayOfNulls<Int>(n)
        for (i in 0 until n){
         print("Enter $i: ")
         arr[i]=sc.nextInt()
        }
        var s: Int? = null

        for (i in 0 until n){
            s=arr[i]

           if (s!!%2==0){
             println("#$i:${arr[i]}")
           }else{
               println("#$i:${s*2}")
           }

        }









    }

}




