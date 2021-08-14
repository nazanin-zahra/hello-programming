package oop

object Practice5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val obj = College("fateme", "razavi")
        obj.func("i hate you i love you")
        obj.demo()
    }

    abstract class Student(name: String, val age: Int) {
        init {
            println("student name is :$name")
        }

        open fun demo() {
            println("Non-abstract function of abstract class")
        }

        abstract fun func(massage: String)
    }

    class College(name: String, family: String) : Student("tahere", 12) {
        override fun func(massage: String) {
            println(massage)

        }

        override fun demo() {
            println("hello my name is suzy")
        }
    }
}