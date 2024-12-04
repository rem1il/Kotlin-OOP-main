package kotlinOOP.task5

fun main() {
    println("Введите имя:")
    val name = readln()
    println("Введите роль (moder или admin):")
    val role = readln().lowercase()

    val user: Person = when (role) {
        "moder" -> Moder(name)
        "admin" -> Admin(name)
        else -> {
            println("Неверная роль!")
            return
        }
    }

    user.showInfo()
}
