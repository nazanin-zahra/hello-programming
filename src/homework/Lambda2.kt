package homework

object Lambda2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = sum(2, 4)
        println("sum: $a")

        calculateAndPrint(
            a = 2,
            b = 5,
            calculation = { x, y ->
                sum(x, y)
            })

        // by lambda
        calculateAndPrint(
            a = 2,
            b = 5,
            calculation = { x, y ->
                subtraction(x, y)
            })

        // by lambda with explicit return (that has label)
        calculateAndPrint(
            a = 2,
            b = 5,
            calculation = { x, y ->
                return@calculateAndPrint subtraction(x, y)
            })

        // by anonymous function
        calculateAndPrint(
            a = 2,
            b = 5,
            calculation = fun(a: Int, b: Int): Int {
                return subtraction(a, b)
            })

        // by callable reference
        calculateAndPrint(
            a = 2,
            b = 5,
            calculation = ::subtraction
        )

        calculateAndPrint(
            a = 2,
            b = 5
        ) { x, y ->
            subtraction(x, y)
        }
    }

    fun sum(a: Int, b: Int) = a + b
    fun subtraction(a: Int, b: Int) = a - b

    fun calculateAndPrint(a: Int, b: Int, calculation: (Int, Int) -> Int) {
        val result = calculation(a, b)
        println("result: $result")
    }
}