package homework

object Lambda1 {
    @JvmStatic

    fun main(args: Array<String>) {
        sayWelcome(lambda = {
            println("This is lambda call")
        })
    }

    fun sayWelcome(lambda: () -> Unit) {
        fun nestedFunction() {
            println("Hello from nested function.")
        }

        lambda()
        nestedFunction()
        println("Welcome")
    }

}