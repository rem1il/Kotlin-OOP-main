package kotlinOOP.task2

class Student(name: String) : Person(name) {
    private var studentId: Int = 0
    
    fun setStudentId(newId: Int) {
        studentId = newId
    }
    
    fun printStudentDetails() {
        println("Name: <${getName()}>, Student ID: <$studentId>")
    }
}
