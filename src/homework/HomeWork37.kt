package homework

object
HomeWork37 {
    //ارایه غیر خالی را گرفته که شامل اعداد تکراری است
    //ولی تنها یک عدد ان تکراری نیست
    //ان عضو را یافته و چاپ کنید
    @JvmStatic
    fun main(args: Array<String>) {
        val n = arrayOf(1, 3, 4, 1, 3)
        println("out:${findByFeriMethod(n)}")
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










