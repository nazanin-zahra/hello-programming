package homework

object ListsExtension {
    @JvmStatic
    fun main(args: Array<String>) {

        val l = listOf(20, 30, 40, 50)

        l.forEachIndexed { index, i ->
            println("$index: $i")
        }

        val list2: List<Int> = l.map {
            it + 100
        }
        list2.forEach { println(it) }

        val filteredItems: List<Int> = list2.filter { it > 120 }

        val item: Int? = list2.find { it > 120 }

        //    fun
        list2.sum()
        list2.average()
        println(list2)
        val formatted = list2.joinToString(separator = " - ") { "$it" }
        println(formatted)

        list2.forEachIndexed { index, i ->
            print(i)
            if (index < list2.size - 1)
                print(" - ")
        }

        val all: Boolean = list2.all { it < 200 }
        val any: Boolean = list2.any { it < 200 }
        val count: Int = list2.count() // list2.size
        val count2: Int = list2.count { it < 130 }
    }
}