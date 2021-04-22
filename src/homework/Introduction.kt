package homework

import java.util.*

object Introduction {
    @JvmStatic
        fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter your first name: ")
        val firstName = sc.nextLine()
        print("Enter your last name: ")
        val lastName = sc.nextLine()
        print("How old are you ?")
        val age = sc.nextLine()
        println("I am ${firstName.capitalize()} ${lastName.capitalize()}.")
        println("I am $age years old.")
    }
}