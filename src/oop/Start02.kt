package oop

object Start02 {
    @JvmStatic
    fun main(args: Array<String>) {
//        val person = Person("Nazi")
//        person.eyeColor = "Green"

        val person = Person("Feri", "Blue")


        println("${person.name} eyeColor is ${person.eyeColor} ")
        person.run()
        person.stopRunning()


        val car1 = Car("Red", 4)
        val car2 = Car("Blue")
        val car3 = Car("Black", 2)
    }


    class Person constructor(val name: String) {
        var eyeColor: String? = null

        init {
            println("Primary constructor has called")
        }

        constructor(_name: String, _eyeColor: String) : this(_name) {
            println("Secondary constructor has called")
            this.eyeColor = _eyeColor
        }

        fun run() {
            println("I'm running right now")
        }

        fun stopRunning() {
            println("I'm not running right now")
        }

    }

    class Car(color: String, wheelCount: Int = 4) {
        init {
            println("$color car has $wheelCount wheels")
        }
    }
}