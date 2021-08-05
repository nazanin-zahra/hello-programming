package oop
// access modifier /visibility modifier
object Practice4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val obj1 = Parent()
        val obj2 = Child()

    }

    open class Parent {
        var num = 100
        protected var str = "Beginners book"
        protected open val ch: Char = 'A' //diffrence with "A"?
        protected open val ch1: String = "A" //diffrence with "A"?
        internal val number = 99
        open protected fun demo() {

        }
        //protected open fun demo()
        //no diffrence
        // you can change these two
    }

    class Child : Parent() {
        override val ch = 'z'
        override fun demo() {
            println("demo function of child class")
        }
        //  override public fun demo() {
        // you can not use obj2.demo(). because you dint mentioned it is pubic thets why fun demo is protected by defult
        //becaused you didnt mention any access modifier
    }
}