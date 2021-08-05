package oop

object Start05 {

    @JvmStatic
    fun main(args: Array<String>) {
        val ch1 = MyChildClass()
        ch1.myFunction()
        ch1.x
        ch1.myParentFunction()
    }

    open class MyParentClass {
        val x = 5
        fun myParentFunction() {
            println("I'm working from parent")
        }
    }

    class MyChildClass : MyParentClass() {
        //constroctor()
        // if you had written constroctor() then you could omit () which is next to the MyParentClass
        //but now you didnt mentioned so that you have to write () next to the MyParentClass
        fun myFunction() {
            println(x)  // x is now inherited from the superclass
        }
    }
}