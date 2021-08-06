package exception

import java.util.*

object ExceptionWork01 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter a number:")
        try {
            val n = sc.nextInt()
            if (n.rem(10) != 0)
                throw Exception("number must be in order of 10")
            println(100 / n)
        } catch (e: InputMismatchException) {
            println("Mismatch input")
        } catch (e: ArithmeticException) {
            println("I have issue in mathematical operation.")
        } catch (e: Exception) {
            println("I have an exception. $e")
        } finally {
            println("Done")
        }

    }
}