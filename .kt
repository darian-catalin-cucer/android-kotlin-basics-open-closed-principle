// Example of Open-Closed Principle in Kotlin

interface Shape {
    fun area(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun area() = width * height
}

class Circle(private val radius: Double) : Shape {
    override fun area() = Math.PI * radius * radius
}

class AreaCalculator(private val shapes: List<Shape>) {
    fun sumAreas(): Double {
        var sum = 0.0
        for (shape in shapes) {
            sum += shape.area()
        }
        return sum
    }
}

fun main() {
    val shapes = listOf(Rectangle(2.0, 4.0), Circle(3.0))
    val calculator = AreaCalculator(shapes)
    val sum = calculator.sumAreas()
    println("Total area: $sum")
}
