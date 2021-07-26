package oop

object HomeWork2 {
    @JvmStatic

    fun main(args: Array<String>) {
        val fish = Fish("in the sea")
        fish.swimming()
        println("fish's moving is  ${fish.move}")
        fish.makeSound()
        println("fish is in the ${fish.group} group")
        println()

        val tiger = Tiger("on the ground", 4)
        tiger.run()
        println("tiger's  moving is ${tiger.move}")
        tiger.makeSound()
        println()

        val bird: Bird = Bird("in the sky", 2)
        bird.fly()
        println("the bird's food is ${bird.food}")
        println("bird's  moving is ${bird.move}")
        bird.makeSound()


        val tiger2 = Tiger("on the ground", 4)
        val tiger3 = Tiger("on the ground", 4)
        val bird2 = Bird("in the sky", 2)
        val bird3 = Bird("in the sky", 2)
        val bird4 = Bird("in the sky", 2)

        val jungle: List<Animal> = listOf(fish, tiger, tiger2, tiger3, bird, bird2, bird3, bird4)

        println()
        println()
        for (animal: Animal in jungle) {
            animal.makeSound()
            when (animal) {
                is Bird -> animal.fly()
                is Fish -> animal.swimming()
                is Tiger -> animal.run()
            }
        }

    }

    abstract class Animal(
        val name: String,
        val food: String,
        val move: String,
        val group: String
    ) {
        abstract fun makeSound()
    }

    class Fish(
        val liveIn: String
    ) : Animal("Fish", "plant", "swimming", "abziyan") {
        fun swimming() {
            println("fish can swim")
        }

        override fun makeSound() {
            println("fish's sound  is ghobghob")
        }

    }

    class Tiger(
        val liveIn: String,
        val leg: Int
    ) : Animal("Tiger", "meat", "running", "pestandaran") {
        fun run() {
            println("tiger can run")
        }

        override fun makeSound() {
            println("tiger's sound is khhhh")
        }
    }


    class Bird(
        val liveIn: String,
        val leg: Int
    ) : Animal("Bird", "plant and bread", "flying", "parandegan") {
        fun fly() {
            println("bird can fly")
        }

        override fun makeSound() {
            println("bird's sound is jikjikjikjik")
        }
    }

}


