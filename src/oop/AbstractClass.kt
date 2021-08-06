package oop

object AbstractClass {

    @JvmStatic
    fun main(args: Array<String>) {
        val ch = Child()
        ch.makeSound()
        ch.breath()
    }

    abstract class Parent() {
        abstract fun makeSound()
        open fun breath() {
            println("breathing from parent`")
        }
    }

    class Child : Parent() {
        override fun makeSound() {
            println("fish's sound  is ghobghob")
        }

        override fun breath() {
            super.breath()
        }
    }
}