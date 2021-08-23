package sem01.home01

class CallLog {
    private val list = mutableListOf<Call>()

    fun addNewCall(call: Call) {
        list.add(call)
    }

    fun removeCall(phoneNumber: String) {
        throw Exception("removeCall is not supported now.")
    }

    fun printAll() {
        println("Call log:")
        println("----------------------")
        for (i in 0 until list.size) {
            val call = list[i]
//            println("$i. ${call.phoneNumber}\t${call.type}\t${call.createdAt}")
            println("$i. ${call.toString()}")
        }
    }
}