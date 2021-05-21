package homework

object HomeWork34 {

    // ارایه input را در نظر بگیرید که شامل مجموعه ای از اعداد طبیعی است . اما یک عضو ان کم شده .
    //ان عضو را بیابید و چاپ کنید .
    @JvmStatic
    fun main(args: Array<String>) {
        val input = arrayOf(2, 0, 1)
        val missedItem = findMissedItem(input)
        println("missed number: $missedItem")
    }
    private fun findMissedItem(list: Array<Int>): Int {
        for (i in 0..list.size) {
            if (i !in list) {
                return i
            }
        }
        return -1
    }
}


