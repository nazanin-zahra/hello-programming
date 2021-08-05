package oop

object Constructor {

    @JvmStatic
    fun main(args: Array<String>) {
        val ex1 = Example("A1")
        ex1.a   // A1

        val ex2 = Example("A2", "B2")
        println(ex2.a)   // A2
        println(ex2.b)   // B2

        val ex3 = DefaultExample("A3", 1)
        val ex4 = DefaultExample("A3")
        val ex5 = DefaultExample()
        val ex6 = DefaultExample(b = 200)
        ex6.say("Hello")
        ex6.say()


        val stu1 = Student("Farhad")
        val stu2 = Student("Nazi", 16)

        println(stu1.name)  // Farhad
        println(stu1.age)   // 100

        println(stu2.name)  // NA
        println(stu2.age)   // 100
    }

    class Example(val a: String) {
        var b: String = ""

        constructor(a: String, b: String) : this(a) {
            this.b = b
        }
    }

    class DefaultExample(val a: String = "No Name", val b: Int = 0) {
        fun say(message: String = "Hello") {
            println("message is: $message")
        }
    }

    class Student {
        var name: String = "NA"
        var age: Int = 100

        constructor(name: String) : super() {
            this.name = name
        }

        constructor(name: String, age: Int) {
            // code inside constructor
        }
    }
}