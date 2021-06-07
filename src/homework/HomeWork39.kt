package homework

import java.util.*

object
HomeWork39 {

    // برنامه ای که لیستی از کلمات را گرفته
    //و کوتاه ترین وبزرگترین کلمه را چاپ کند
    @JvmStatic
    fun main(args: Array<String>) {
    val input= listOf<String>("Nazi","Apple","Company" )
        var smaller=input[0].length
        var bigger=input[0].length
        for (i in input.indices){
            if (input[i].length<smaller)
           smaller= input[i].length
            else if (input[i].length>bigger)
                bigger=input[i].length
        }
        println("$smaller\n$bigger")
    }

}

