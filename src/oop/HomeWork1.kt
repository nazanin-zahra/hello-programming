package oop

object HomeWork1 {
    @JvmStatic
    //کلاسی بنویسید که موجودیت ماشین را معرفی کند.
    //و شامل نوع.رنگ.وشماره پلاک ان باشد.
    //و متودی که اطلاعات ان را چاپ کند
    //و متودی هم برای چاپ کردن پلاک ان بنویسید
    fun main(args: Array<String>) {
        val car1 = Car("blue", "Samand", 564787465, false, Engine(4))
        val car2 = Car("red", "pride", 534267345, false, Engine(4))
        val car3 = Car("green", "AOD", 543673248, true, Engine(8))
        val car4 = Car("pink", "ferrari", 546378832, true, Engine(8))
        val car5 = Car("gold", "porche", 637289365, true, engine = Engine(5))
        val car6 = Car("black", "L90", 734256389, false, Engine(4))
        val car7 = Car("silver", "mazda", 943562767, true, Engine(5))
        val car8 = Car("dark blue", "jaguwar", 721342562, false, Engine(6))
        val car9 = Car("white", "bmw", 876432457, true, Engine(5))
        val car10 = Car(
            numberPlate = 634521789,
            engine = Engine(4),
            type = "vanet",
            color = "yellow",
            hasSunroof = false
        )
        println("car's number plate:${car1.numberPlate}")
        car1.printDetail()
        val cars = listOf(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10)
        for (car in cars) {
            if (car.engine.silandr > 4) {
                print(car.type + " ")
            }
        }
        println()


        //  cars.forEach{car ->
        //    if (car.engine.silandr>4){
        //        print(car.type)
        //  }
        //println()


        //cars.filter { car -> car.engine.silandr>4  }
        //  .forEach{car -> print(car.type) }
        //println()


        //}
        for (car in cars) {
            if (car.hasSunroof) {
                print(car.type + " ")
            }
        }
        println()


        cars.forEach { car: Car ->
            if (car.hasSunroof) {
                print(car.type + " ")
            }
        }
        println()


        cars.filter { car -> car.hasSunroof }
            .forEach { car -> print(car.type + " ") }
    }

    class Car constructor(
        val color: String,
        val type: String,
        val numberPlate: Int,
        val hasSunroof: Boolean,
        val engine: Engine
    ) {
        init {
//            println("A $type has created with color: $color \n number plate: $numberPlate")
        }

        fun printDetail() {
            println("type: $type, color: $color, number plate: $numberPlate")
        }
    }

    class Engine(val silandr: Int)

}
