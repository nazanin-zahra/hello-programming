package oop

object Modifiers {

    @JvmStatic
    fun main(args: Array<String>) {
        val ex1 = Example()
//        ex1.x = 10
//        ex1.y = 15
        println(ex1.calculateSquare())
//        println(ex1.calculateSquare2())
    }

    open class Example {

        private var x: Int = 4
        protected var y: Int = 4
        var z: Int = 4

        fun calculateSquare(): Int {
            return x * x
        }

        protected fun calculateSquare2(): Int {
            return x * x
        }
    }

    class SubExample : Example() {
        fun subFun() {
            println("x is not accessible")
            println("y equals $y")
            println("z equals $z")

            calculateSquare2()
        }
    }

}