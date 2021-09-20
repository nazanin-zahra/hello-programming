package sem01.home02


object TelephoneBook {
    @JvmStatic
    fun main(args: Array<String>) {
        val contact = ContactsInBook()
        contact.addNewContact(Contacts("Nazi", "09125463427", "18:43", Type.Mobile, "she is student and 17 years old"))
        contact.addNewContact(Contacts("ati", "09813425637", "06:43", Type.Mobile))
        contact.addNewContact(Contacts("House", "02165572894", "21:06", Type.Home, "i like the one who call me"))
        contact.addNewContact(Contacts("kishway", "0216534728", "20:23", Type.Work))
        contact.printAll()

        contact.removeContact("kishway")
        val inquiry = contact.inquiry("Nazi")
        if (inquiry) {
            println("this name is in the contacts")
        } else {
            println("this name is not in the contacts")
        }
        contact.printAll()
    }
}