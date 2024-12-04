package kotlinOOP.task4

fun main() {
    println("Введите команду:")
    val command = readln()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("Неверная команда")
    }
}
