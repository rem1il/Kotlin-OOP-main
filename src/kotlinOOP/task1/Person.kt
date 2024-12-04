package kotlinOOP.task1

class Person(private var name: String) {

    fun setName(newName: String) {
        name = newName
    }

    fun printName() {
        println("Name: <$name>")
    }

    fun enterData(list: ArrayList<Person>) {
        println("введите количество людей:")
        val n = readln().toInt()

        for (i in 1..n) {
            println("введите имя человека:")
            val name = readln()
            val person = Person(name)
            person.setName(name)
            list.add(person)
        }
    }

    fun printList(list: ArrayList<Person>) {
        for (person in list) {
            person.printName()
        }
    }
}
