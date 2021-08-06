package oop

object Interface {

    @JvmStatic
    fun main(args: Array<String>) {
        val cls = MyClass()
        cls.sayHello()
        cls.makeSound()
        println(cls.str)
        cls.doSth("Hiiiii")
    }

    interface MyInterface {
        var str: String
        fun makeSound()
        fun sayHello() {
            println("Hello")
        }
    }

    interface MyInterface2 {
        fun doSth(message: String)
    }

    class MyClass : MyInterface, MyInterface2 {
        override var str: String = "A random string"

        override fun makeSound() {
            println("Making sound from class")
        }

        // doesn't need to be open
        override fun sayHello() {
            super.sayHello()
        }

        override fun doSth(message: String) {
            println("doSth with $message")
        }
    }
}