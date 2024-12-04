package kotlinOOP.task2

open class Person(private var name: String) {
    fun setName(newName: String) {
        name = newName
    }
    
    fun printName() {
        println("Name: <$name>")
    }
    
    protected fun getName(): String {
        return name
    }
}