package homework

object DataClass {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = A("Nazi", 16)
        val b = B("Nazi", 16)

        println("a is $a")
        println("b is $b")

        // val bb = B("Nazanin", b.age)
        val bb = b.copy(name = "Nazanin")
        println("bb is $bb")

        println("component1 of bb is ${bb.component1()}")
    }


    class A(val name: String, val age: Int)
    data class B(val name: String, val age: Int)
}