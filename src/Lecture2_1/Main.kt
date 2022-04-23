package Lecture2_1

private var userList : MutableList<Person> = mutableListOf()

    fun main () {
        val user1 = Person("Даша", "Тарасова", 34)
        val user2 = Person("Мария", "Афанасьева", 56)
        val user3 = Person("Аврора", "Лесничая", 23)
        val user4 = Person("Афий", "Броский", 33)
        val user5 = Person("Флавий", "Терентов", 15)
        add(user1)
        add(user2)
        add(user3)
        add(user4)
        add(user5)
        showList()
        deleteByAge()

    }

    private fun add (user: Person) {
        userList.add(user)
    }

    fun toString(person: Person): String {
    return "Name: ${person.name}  Surname:  ${person.secondName}  Age:  ${person.age}"
}

    private fun showList () {
        userList.sortBy { it.name }
        for (person in userList) {
            println(toString(person))
        }
    }

    fun deleteByAge() {
        userList.removeIf { it.age <= 18 }
        for (person in userList) {
            println(toString(person))
        }
    }


