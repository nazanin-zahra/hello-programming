package oop

object Start04 {

    @JvmStatic
    fun main(args: Array<String>) {
        val c1 = Car("Saipa", "151", 1399)
        println(c1.brand)
        println(c1.model)
        println(c1.year)
        c1.speed(maxSpeed = 150)


        val c2 = Car(brand = "IRK", model = "Samand", year = 1399)
        println(c2.brand)
        c2.drive()
        c2.speed(180)
    }

    class Car(var brand: String, val model: String, val year: Int) {
        fun drive() {
            println("Wrooom!")
        }

        fun speed(maxSpeed: Int) {
            println("Max speed is $maxSpeed")
        }
    }
}