package sem01.home01

class Call(
    val createdAt: String,
    val phoneNumber: String,
    val type: Type
) {
    override fun toString(): String {
        return "$phoneNumber\t*\t$createdAt\t*\t$type"

    }

    enum class Type {
        In,
        Out
    }
}