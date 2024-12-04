package kotlinOOP.task4

class Guitar: Playable {
    override fun play() {
        println("Гитара играет")
    }

    fun guitarPlay() {
        println("Введите команду play")
        val a = readln()

        if (a == "play") {
            val guitar = Guitar()
            guitar.play()
        } else {
            println("Неверная команда")
        }
    }
} 