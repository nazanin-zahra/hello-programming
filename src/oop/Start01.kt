package oop

object Start01 {
    @JvmStatic
    fun main(args: Array<String>) {
        val naziAge: Int = 17
        val st1: Student = Student("Sara", "Ghornabi", 12)
        val st2: Student = Student("Nazi", "Beigirad", naziAge)
        val st3 = Student("Farhad", "Rad", 26)
        val studentList: List<Student> = listOf(st1, st2, st3, Student("Ati", "beigi", 34))

        st1.introduce()
        st2.introduce()

        println("st3's name is ${st3.name}")
        println("st3's fullName is ${st3.fullName}")
    }

    class Student(
        val name: String,
        val family: String,
        val age: Int
    ) {
        val fullName = "$name $family"

        init {
            println("student created with name: $name, age: $age")
        }

        fun introduce() {
            println("My name is $name $family. I'm $age years old.")
        }
    }
}