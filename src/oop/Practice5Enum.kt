package oop

// ask your bro about value of ()
//and show him the screen shouts
object Practice5Enum {
    @JvmStatic
    fun main(args: Array<String>) {
        val h1 = House.Room
        val h2 = House.Kitchen.color
        val h3 = House.Kitchen.declaringClass
        val h4 = House.Kitchen.name
        val h5 = House.Kitchen.ordinal
        val h6 = House.Room.toString() // diffrence with to string()-->Any???
        val h7 = House.Room.ordinal
        val h8 = House.Dishes.ordinal
        println(h1)
        println(h2)
        println(h3)
        println(h4)
        println(h5)
        println(h6)
        println(h7)
        println(h8)
        val house1 = House2.Kitchen.hoursForWork(4)
        println(house1)
        val house2 = House3.Neighbor2.guest(5)
        println(house2)
        val house3 = House2.Dishes.hoursForWork(8)
        println(house3)
        //   val a=House.valueOf("room")
        // println(a)
    }

    enum class House(val color: String) {
        Room("yellow"),
        Kitchen("brown"),
        Dishes("blue")
    }

    enum class House2(val color: String) {
        Room("green") {
            override fun hoursForWork(hours: Int) = "cleaning the room takes $hours hours"
        },
        Kitchen("black") {
            override fun hoursForWork(hours: Int) = "cleaning the kitchen takes $hours hours"
        },
        Dishes("pink") {
            override fun hoursForWork(hours: Int) = "washing the dishes takes $hours hours "
        };

        abstract fun hoursForWork(hours: Int): String
    }

    interface NeighborsHouse {
        fun guest(guest: Int): String
    }

    enum class House3 : NeighborsHouse {
        Neighbor1 {
            override fun guest(guest: Int) = "the neighbor1 has $guest guests"
        },
        Neighbor2 {
            override fun guest(guest: Int) = "the neighbor2 has $guest guests"
        }
    }
}