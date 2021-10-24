package homework

object ExtensionFunctions {
    @JvmStatic
    fun main(args: Array<String>) {
        val p = Person("Nazi")
        p.introduceYourSelf()
        p.walk()
        p.running()

        val a = 12
        val result = split(a)
        println(result)

        val result1 = a.split1()
        println(result1)

        a.until(11)

    }

    fun split(value: Int): List<Int> {
        val output = mutableListOf<Int>()
        var a = value
        while (a > 0) {
            output.add(a.rem(10))
            a /= 10
        }
        return output
    }

    fun Int.split1(): MutableList<Int> {
        val output = mutableListOf<Int>()
        var a = this
        while (a > 0) {
            output.add(a.rem(10))
            a /= 10
        }
        return output
    }

    fun Person.running() {
        println("Running...")
    }

    class Person(val name: String) {
        fun introduceYourSelf() {
            println("I'm $name.")
        }

        fun walk() {
            println("I'm walking")
        }
    }
}