package sem01.home01

class CallLog {
    private val list = mutableListOf<Call>()

    fun addNewCall(call: Call) {
        list.add(call)
    }

    fun removeCall(phoneNumber: String) {
        for (call in list) {
            if (phoneNumber == call.phoneNumber) {
                list.remove(call)
            }

        }
//        for (i in 0 until list.size) {
//            if (phoneNumber == list[i].phoneNumber) {
//                list.remove(list[i])
//            }
//        }
    }
    // both of them are right but if you do the second you will have problem
    //cause of the index
    // so for removing a call in a list ,you should use call except index


    fun printAll() {
        println("Call log:")
        println("----------------------")
        for (i in 0 until list.size) {
            val call = list[i]

//            println("$i. ${call.phoneNumber}\t${call.type}\t${call.createdAt}")
            println("$i. $call")
            // u could say call.to string()
            // writting that is optional
            // when you write print (call)
            // it means print call.to string()
        }
    }
}