package sem01.home01

object Home01 {
    @JvmStatic
    fun main(args: Array<String>) {
        val log = CallLog()
        log.addNewCall(Call("2021/11/10", "09121231231", Call.Type.In))
        log.addNewCall(Call("2021/11/11", "09363456789", Call.Type.Out))
        log.addNewCall(Call("2021/11/11", "09112345678", Call.Type.Out))

        log.printAll()

        log.removeCall("09363456789")
        log.printAll()


    }
}