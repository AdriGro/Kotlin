
private var userList : MutableList<Person> = mutableListOf()

fun main (){

    val user1 = Person("Juls", "Mihnyuk", 22)
    val user2 = Person("Sashka", "Zhizhensky", 26)
    add(user1)
    add(user2)
    showList()
}


private fun add (user: Person) {
    userList.add(user)
}

fun toString(person: Person): String {
    return "Name: ${person.name}  Surname:  ${person.secondName}  Age:  ${person.age}"
}

private fun showList () {
    for (person in userList) {
        println(toString(person))
    }
}