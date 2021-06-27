package homework

object HomeWork46 {

    // selection sort و bubble sort ترکیب
    @JvmStatic
    fun main(args: Array<String>) {
        val input = listOf(-5, 14, 33, 27, 10, 35, 34, 0)

        println("by bubble:${bubbleSort(input)}")
        println("by selection:${selectionSort(input)}")
    }

    private fun selectionSort(inputList: List<Int>): List<Int> {
        val sortedList: MutableList<Int> = inputList.toMutableList()
        for (i in 0 until sortedList.size - 1) {
            var smallest = i
            for (j in i + 1 until sortedList.size) {
                if (sortedList[smallest] > sortedList[j])
                    smallest = j
            }
            if (sortedList[smallest] < sortedList[i]) {
                val temp = sortedList[smallest]
                sortedList[smallest] = sortedList[i]
                sortedList[i] = temp
            }
        }
        return sortedList
    }

    private fun bubbleSort(inputList: List<Int>): List<Int> {
        val sortedList: MutableList<Int> = inputList.toMutableList()

        for (pass in 0 until sortedList.size) {
            for (i in 0 until sortedList.size - 1) {
                if (sortedList[i] > sortedList[i + 1]) {
                    val temp = sortedList[i + 1]
                    sortedList[i + 1] = sortedList[i]
                    sortedList[i] = temp
                }
            }
        }

        return sortedList
    }


}

