package homework

import java.util.*

object HomeWork19 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter m: ")
        val m = sc.nextInt()

        // val primary = isPrimary(m)
        val primary = isPrimary2(m)
        if (primary) {
            print("primary")
        } else {
            print("not primary")
        }
    }

    fun isPrimary(number: Int): Boolean {
        if (number <= 1) {
            return false
        }
        var mIsPrimary = true
        for (i in 2 until number) {
            if (number % i == 0) {
                mIsPrimary = false
            }
        }
        return mIsPrimary
    }

    fun isPrimary2(number: Int): Boolean {
        if (number <= 1) {
            return false
        }
        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
}