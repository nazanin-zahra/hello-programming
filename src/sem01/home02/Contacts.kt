package sem01.home02

open class Contacts(
    val name: String,
    val phoneNumber: String,
    val historyTime: String,
    val type: Type,
    val note: String? = ""
) {
    override fun toString(): String {
        return "$name \t*\t $phoneNumber\t*\t $historyTime\t*\t $type\t*\t $note"
    }
    // constructor(phoneNumber: String):this(name,phoneNumber)


}

enum class Type {
    Mobile,
    Home,
    Work,
    Other
}