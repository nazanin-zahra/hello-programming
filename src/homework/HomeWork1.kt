package homework

import java.util.*

object HomeWork1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter a:")
        val a = sc.nextInt()
        print("Enter b:")
        val b = sc.nextInt()
        print("Enter c:")
        val c = sc.nextInt()
        print("Enter d:")
        val d = sc.nextInt()

//        if (a > c + d) {
//            print(a * c)
//        } else {
//            print(b * d)
//        }

        val result = if (a > c + d) {
            a * c
        } else {
            b * d
        }

        print(result)


    }


}