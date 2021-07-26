package oop

object Start03 {

    @JvmStatic
    fun main(args: Array<String>) {
        //  val phone = Phone("09121234567")
//        phone.color = "Green"
//        phone.number
//        phone.ring()
//        phone.hold()
//        phone.endCall()

        val mobile1 = Mobile("0936", "1231231", 8797)
        mobile1.code
        mobile1.shortNumber
        mobile1.number
        mobile1.color
        mobile1.isRegistered
        mobile1.password
        mobile1.ring()
        mobile1.hold()
        mobile1.reject()
        mobile1.endCall()
    }

    abstract class Phone(val number: String, val isRegistered: Boolean, val password: String?) {
        var color: String? = null

        constructor(number: String) : this(number, false, "Pass2")
        constructor(number: String, color: String) : this(number, true, "MyPass") {
            this.color = color
        }

        fun ring() {
            println("Im ringing")
        }

        fun hold() {
            println("Im hold")
        }

        abstract fun endCall()
    }

    class Mobile(val code: String, val shortNumber: String, val cardId: Int) : Phone(code + shortNumber, "Green") {
        fun reject() {
            println("Rejected")
        }

        override fun endCall() {
            println("end call pressed")
        }
    }
}