package kotlinOOP.task2

fun main() {
    println("введите количество студентов:")
    val n = readln().toInt()
    
    for (i in 1..n) {
        val input = readln().split(" ")
        val student = Student(input[0])
        student.setName(input[0])
        student.setStudentId(input[1].toInt())
        student.printStudentDetails()
    }
}