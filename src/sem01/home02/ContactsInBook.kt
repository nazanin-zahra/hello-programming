package sem01.home02

class ContactsInBook {
    private val list = mutableListOf<Contacts>()

    fun addNewContact(contact: Contacts) {
        list.add(contact)
        println("New contact has been added. name: ${contact.name}")
    }

    fun removeContact(contactName: String) {

        /*for (contact in list) {
            if (contactName == contact.name) {
                list.remove(contact)
            }
        }*/
        // ConcurrentModificationException
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val contact = iterator.next()
            if (contactName == contact.name) {
                iterator.remove()
                println("Contact with name: ${contact.name} has been removed.")
            }
        }

        // or
        /*list.removeAll { contact ->
            contact.name == contactName
        }*/
    }

    fun inquiry(name: String): Boolean {
        for (i in 0 until list.size) {
            if (name == list[i].name) {
                return true
            }
        }
        return false
    }

    fun printAll() {
        println("\nAll Contacts (${list.size})")
        println("-------------------------------------")
        for (i in 0 until list.size) {
            val contact = list[i]
            println("$i \t $contact")
        }
    }
}






