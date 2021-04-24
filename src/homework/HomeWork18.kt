package homework

import java.util.*

object HomeWork18 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter m: ")
        val m = sc.nextInt()

        if (m <= 1) {
            print("not primary")
            return
        }
        var primary = true
        for (i in 2 until m) {
            if (m % i == 0) {
                primary = false
            }
        }

        if (primary) {
            print("primary")
        } else {
            print("not primary")
        }
    }
}