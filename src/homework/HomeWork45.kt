package homework

object HomeWork45 {
    // برنامه ای بنویسید که لیستی را گرفته
    //و به شکل صعودی مرتب کند
    //و  سپس لیست مرتب شده را چاپ کند.
    //(که اعداد تکراری نیستند)
    //selection sort
    @JvmStatic
    fun main(args: Array<String>) {
        val input = mutableListOf(-5, 14, 33, 27, 10, 35, 34, 0)
        for (i in 0 until input.size - 1) {
            var smallest = i
            for (j in i + 1 until input.size) {
                if (input[smallest] > input[j])
                    smallest = j
            }
            if (input[smallest] < input[i]) {
                val temp = input[smallest]
                input[smallest] = input[i]
                input[i] = temp
            }
        }
        println("out: $input")

    }
}

