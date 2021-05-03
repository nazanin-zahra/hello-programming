package homework

import java.util.*

object HomeWork25 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = mutableListOf(10, 5, 21, 15, 8)
        println("origin: $input")
        val output = mutableListOf<Int>()
        var i = input.size - 1
        while (i >= 0) {
            output.add(input[i])
            i -= 1
        }
        println("reversed: $output")
    }
}
