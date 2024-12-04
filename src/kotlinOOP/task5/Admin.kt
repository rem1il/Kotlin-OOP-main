package kotlinOOP.task5

class Admin(name: String) : Person(name, "admin") {
    override fun showInfo() {
        println("$name - админ")
    }
}