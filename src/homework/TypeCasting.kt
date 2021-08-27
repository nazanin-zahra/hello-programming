package homework

object TypeCasting {

    @JvmStatic
    fun main(args: Array<String>) {
        val a: Int = 12
        val b: Long = a.toLong()

        val c: Int = Int.MAX_VALUE
        println(c)
        val d: Byte = c.toByte()
        println(d)
        val e: Long = c.toLong()
        println(e)


        println("4.234 to int ${4.234.toInt()}")
        println("66 to char ${66.toChar()}")
        println("C to int ${'C'.toInt()}")
    }
}