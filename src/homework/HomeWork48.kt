package homework

object HomeWork48 {

    // رشته s شامل کاراکتر های  ')'.'('.'}'.'{'.']'.'[' می باشد.
    //valid بودن این رشته را برسی کنید.
    //شرط  valid بودن:
    //۱:گاراگتر های شروع باید با همان بسته شود
    //۲:کاراکتر های شروع که با کاراکتر های پایان بسته میشوند به ترتیب باشد.
    @JvmStatic
    fun main(args: Array<String>) {
        var input = "{()}"

        println(validOrInvalid(input))
    }

    fun validOrInvalid(input: String): String {
        var s = input
        var pair = '('
//        pair += '['
        for (i in 0 until s.length - 1) {
            if (s[i] == s[i + 1]) {
                s = s.removeRange(i, i + 2)
            } else if (s == " ") {
                return ("valid")
            }
        }
        if (s != "") {
            return ("invalid")
        }
        return ("nothing")
    }

}

