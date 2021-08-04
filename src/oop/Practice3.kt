package oop

object Practice3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val obj = Child()
        obj.demo()
        val obj2 = Parent()
        obj2.demo()
    }

    open class Parent() {
        open var num = 100
        open fun demo() {
            println("demo function of parent class")
        }
    }

    class Child() : Parent() {
        override var num = 101
        override fun demo() {
            super.demo()
            println("demo function of child class")
        }

        fun demo2() {
            println(super.num)
        }
    }
}
