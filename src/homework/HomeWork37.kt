package homework

object
HomeWork37 {
    //
    @JvmStatic
    fun main(args: Array<String>) {
        println("out:${findByFeriMethod(arrayOf(1, 3, 4, 1, 3))}")
    }

    fun findByFeriMethod(input: Array<Int>): Int {
        var i = 0
        while (i < input.size) {
            var j = 0
            var isRepeated = false
            while (j < input.size && !isRepeated) {
                if (j != i && input[i] == input[j]) {
                    isRepeated = true
                }
                j++
            }
            if (!isRepeated)
                return input[i]
            i++
        }
        return -1
    }
}










