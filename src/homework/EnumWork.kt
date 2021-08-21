package homework

object EnumWork {
    @JvmStatic
    fun main(args: Array<String>) {
        val i: Int = -1200
        val str: String = ";dkfjdslkhal"
        val b: Boolean = true
        val byte: Byte = -127
        val se1: Season = Season.Winter
        val se2: Season = Season.Fall
        val se3 = Season.Summer
        println(se3)
    }

    enum class Season {
        Spring,
        Summer,
        Fall,
        Winter
    }
}