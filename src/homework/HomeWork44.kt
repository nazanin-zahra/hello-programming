package homework

object HomeWork44 {

    // برنامه ای بنویسید که لیستی را گرفته
    //و به شکل صعودی مرتب کند
    //و  سپس لیست مرتب شده را چاپ کند.
    //(که اعداد تکراری نیستند)
    @JvmStatic
    fun main(args: Array<String>) {
        val input = mutableListOf(23, 14, -5, 46)
        for (pass in 0 until input.size) {
            for (i in 0 until input.size - 1) {
                if (input[i] > input[i + 1]) {
                    val temp = input[i + 1]
                    input[i + 1] = input[i]
                    input[i] = temp
                }
            }
        }
        println("sorted :$input")
    }
}

