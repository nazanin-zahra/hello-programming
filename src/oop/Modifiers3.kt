package oop

object Modifiers3 {

    @JvmStatic
    fun main(args: Array<String>) {
        val m1 = Modifiers2()
        m1.a // a is public
//        m1.b // b is protected
//        m1.c // c is private


        printHello()
    }

    private fun printHello() {
        println("Hello")
    }
}