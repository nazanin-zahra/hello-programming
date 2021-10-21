package homework

object Lambda4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val l = listOf(1, 2, 3, 4, 5)

        l.filter { it > 3 }

        l.filter { x: Int -> x > 3 }

        l.filter(fun(x: Int): Boolean {
            return x > 3
        })

        l.filter(fun(x: Int): Boolean = x > 3)
        
        l.filter(fun(x: Int) = x > 3)
    }
}