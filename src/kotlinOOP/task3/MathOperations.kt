package kotlinOOP.task3

class MathOperations {
    fun add(a: Int, b: Int): Double {
        return (a + b).toDouble()
    }
    
    fun add(a: Double, b: Double): Double {
        return a + b
    }
    
    fun subtract(a: Int, b: Int): Double {
        return (a - b).toDouble()
    }
    
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }
    
    fun multiply(a: Int, b: Int): Double {
        return (a * b).toDouble()
    }
    
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }
    
    fun divide(a: Int, b: Int): Double {
        if (b == 0) {
            throw IllegalArgumentException("Деление на ноль!")
        }
        return (a.toDouble() / b.toDouble())
    }
    
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Деление на ноль!")
        }
        return a / b
    }

    fun menu() {
        println("введите тип данных (Int или Double):")
        val type = readln()
        
        println("введите операцию (add, subtract, multiply, divide):")
        val operation = readln()
        
        println("введите первое число:")
        val a = if (type == "Int") readln().toInt() else readln().toDouble()
        
        println("введите второе число:")
        val b = if (type == "Int") readln().toInt() else readln().toDouble()

        try {
            val result = when (operation) {
                "add" -> if (a is Int && b is Int) add(a, b) else add(a as Double, b as Double)
                "subtract" -> if (a is Int && b is Int) subtract(a, b) else subtract(a as Double, b as Double)
                "multiply" -> if (a is Int && b is Int) multiply(a, b) else multiply(a as Double, b as Double)
                "divide" -> if (a is Int && b is Int) divide(a, b) else divide(a as Double, b as Double)
                else -> throw IllegalArgumentException("Некорректная операция")
            }
            println(result)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}