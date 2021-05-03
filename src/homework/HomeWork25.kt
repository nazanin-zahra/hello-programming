package homework

import java.util.*

object HomeWork25 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = mutableListOf(10, 5, 21, 15, 8)
        println("origin: $input")
        val reversed: List<Int> = reversed(input)
        println("reversed: $reversed")
    }

    fun reversed(list: List<Int>): List<Int> {
        val output = mutableListOf<Int>()

        var i = list.size - 1
        while (i >= 0) {
            output.add(list[i])
            i -= 1
        }
        return output
    }
}
