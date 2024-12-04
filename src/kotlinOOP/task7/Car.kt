package kotlinOOP.task7

import kotlinOOP.task1.Person

class Car(private val brand: String, private val year: Int) {

    private fun set(newBrand: String, newYear: Int) {
        val brand = newBrand;
        val year = newYear
    }

    fun printSet() {
        println("Brand: <$brand>, Year: <$year>")
    }

    fun printDetails(list: ArrayList<Car>) {
        println("введите количество машин:")
        val a = readln().toInt()

        for (i in 1..a) {
            println("введите марку и год через пробел:")
            val input = readln().split(" ")
            val brand = input[0]
            val year = input[1].toInt()
            val car = Car(brand, year)
            list.add(car)

        }

        for (i in list) {
            i.printSet()

        }
    }
}