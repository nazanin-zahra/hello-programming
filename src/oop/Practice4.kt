package oop

object Practice4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val obj1 = Parent()
        val obj2 = Child()
    }

    open class Parent {
        var num = 100
        protected var str = "Beginners book"
        protected open val ch = 'A' //diffrence with "A"?
        internal val number = 99
        open protected fun demo() {}
    }

    class Child : Parent() {
        override val ch = 'z'
        override fun demo() {
            println("demo function of child class")
        }
    }
}