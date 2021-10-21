package homework

object Lambda3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val myInt: Int = 12
        val myString = "Hello"
        val myFunction: (String) -> String = { a: String -> "$myString $a" }
        val myFunction1: (String) -> String = myFunction //OK
        val myFunction2 = myFunction    //OK

        val result = myFunction("Nazanin")
        println(result)
    }
}