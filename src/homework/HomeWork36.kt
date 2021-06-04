package homework

import java.util.*

object
HomeWork36 {
    // برنامه ای که رشته s را گرفته . این رشته شامل حروف بزرگ و کوچکه و اسپیس است .
//طول کلمه اخر این رشته را برگردانید.
    @JvmStatic
    fun main(args: Array<String>) {
        println("out:${sizeOfLastWord("hello good girl nazi")}")
    }

    private fun sizeOfLastWord(s: String): Int {
        var out = 0
        var i = s.length
        while (i >= 0) {
            out += 1
            if (s[i-1] == ' ') {
                return out-1
            }
            i -= 1
        }

        return out
    }

}

