package homework

import java.util.*

object HomeWork6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter n:")
        val n = sc.nextInt()
        (1.rangeTo(n)).forEach { z: Int ->
            val m = n % z
            if (m == 0) {
                print("$z\n\n")
            }
        }
    }
}


