package homework

import java.util.*

object HelloProgramming {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter your name:")
        val name = sc.nextLine()
        print("Enter your family:")
        val family = sc.nextLine()
        sayWelcome(name, family )
        println(sayWelcome(name, family))
    }

    fun sayWelcome(name: String, family: String): String {
        println("Welcome ${name.capitalize()} ${family.capitalize()}")
        return "good bye"

    }
}