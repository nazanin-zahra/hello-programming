package oop

object ConstructorAny {

    @JvmStatic
    fun main(args: Array<String>) {
        val ex1 = Example("A1")
        val ex2 = Example("A2")
        val ex3 = Any()
        val ex4 = Any()

        println("any3 is " + ex3.toString())
        println("any4 is " + ex4.toString())
        println("example1 is " + ex1.toString())
        println("example2 is " + ex2.toString()) // or
        println("example2 is $ex2")
    }

    open class Example {
        var b: String = ""

        constructor(b: String) : super() {
            this.b = b
        }

        // writting (super()) is opitioal
        // because it calls any in any case
        override fun toString(): String {
            //   return super.toString()
            return "b = $b"
        }
    }

    class ExampleChild : Example {
        var c: String = ""

        constructor(c: String) : super("B") {
            this.c = c
        }
    }
}