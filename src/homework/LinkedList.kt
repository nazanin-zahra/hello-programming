package homework

object LinkedList {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = mutableListOf<String>()

        list.add("A")
        list.add("C")
        list.add("D")
        list.add("E")
        println("after adding 4 item: $list")

        list.add(1, "B")
        println("after dding B in #1: $list")

        list.removeAt(3)
        println("after removing #3: $list")

        list.remove("A")
        println("after removing A: $list")

        println("length of list is :${list.size}")

        list[1] = "N" // or list.set(1, "N")

        val n1 = list[1] // list.get(1)

        list.clear()
    }
}