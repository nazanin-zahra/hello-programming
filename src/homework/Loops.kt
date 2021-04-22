package homework

object Loops {
    @JvmStatic
    fun main(args: Array<String>) {
//        println(1)
//        println(2)
//        println(3)
//        println(4)
//        println(5)

        val collection = 1.rangeTo(10)
        var summery = 0
        for (i in collection ) {
            if (i % 2 == 1) {
                summery = summery + i
            }
        }
        println(summery)
    }
}