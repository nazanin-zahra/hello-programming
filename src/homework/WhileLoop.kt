package homework

import java.util.*

object WhileLoop {
    @JvmStatic
    fun main(args: Array<String>) {
        // with for loop
        // for (counter in 50..100) {
        //     println(counter)
        // }


        // with while loop
        var counter = 50
        while (counter <= 100) {
            println(counter)
            counter = counter + 1
        }
    }
}