package homework

object Lambda5 {
    @JvmStatic
    fun main(args: Array<String>) {
        // anonymous function
        val l = listOf(1, 2, 3, 4, 5, 6)
        l.forEach(fun(x: Int) {
            println("$x")
        })
        // lambda
        l.forEach { x ->
            println("$x")
        }

        l.forEach { println("$l") }

        l.forEach(fun(x: Int): Unit = println("$x"))

        l.forEach(fun(x: Int) = println("$x"))


    }
}