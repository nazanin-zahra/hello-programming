package homework

import java.util.*
import kotlin.math.PI
import kotlin.math.pow

object LoopsExample3 {
    @JvmStatic
    fun main(args: Array<String>) {
     val sc = Scanner(System.`in`)
        print("Enter R: ")
        val r=sc. nextInt()
        val r1= PI*r.toDouble().pow(2)
        val r2= PI*(2*r)
     println("$r1,  \n$r2")


    }
}