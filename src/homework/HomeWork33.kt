package homework

object HomeWork33 {

    // برنامه ای که عدد n را گرفته و ارقام ان را با هم جمع کند که حاصل یک عدد یا رقمی شود .
    @JvmStatic
    fun main(args: Array<String>) {
        val n = 3679
        val firstMethod = withoutLoop(n)
        println("output1: $firstMethod")
        val secondMethod = withWhileLoop(n)
        println("output2: $secondMethod")
        val thirdMethod = withDoWhileLoop(n)
        println("output3: $thirdMethod")
    }

    fun withoutLoop(m: Int): Int {
        if (m == 0) return 0
        val r = m % 9
        return if (r == 0) 9 else r
    }

    fun withWhileLoop(input: Int): Int {
        if (input == 0) return 0
        var t = input
        var sum = 0

        while (sum > 9 || sum == 0) {
            if (sum > 9) {
                t = sum
                sum = 0
            }
            while (t > 0) {
                val r = t % 10
                sum += r
                t /= 10
            }
        }
        return sum
    }

    fun withDoWhileLoop(input: Int): Int {
        var t = input
        var sum = 0

        do {
            if (sum > 9) {
                t = sum
                sum = 0
            }
            while (t > 0) {
                val r = t % 10
                sum += r
                t /= 10
            }
        } while (sum > 9)
        return sum
    }
}

