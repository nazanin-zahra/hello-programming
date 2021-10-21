package homework

object Lambda1 {
    @JvmStatic
    fun main(args: Array<String>) {
        sayWelcome(lambda = {
            println("This is lambda call")
        })
    }

    fun sayWelcome(lambda: () -> Unit) {
        fun localFunction() {
            println("Hello from nested function.")
        }

        regularFunction()
        lambda()
        localFunction()
        println("Welcome")
    }

    fun regularFunction() {
        println("Hello from regular function")
    }
}