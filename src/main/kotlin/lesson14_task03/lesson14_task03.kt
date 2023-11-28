package lesson14_task03

fun main() {
    val blackRectangle = Rectangle("black", 5.0, 5.0)
    val blackCircle = Circle("black", 6.0)
    val whiteRectangle = Rectangle("white", 9.0, 3.0)
    val whiteCircle = Circle("white", 4.0)

    println("Сумма периметров всех черных фигур: ${blackCircle.perimeter() + blackRectangle.perimeter()}")
    println("Сумма площадей всех белых фигур: ${whiteCircle.square() + whiteRectangle.square()}")
}

open abstract class Figure(val color: String) {
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun square(): Double {
        return 3.14 * (radius * radius)
    }

    override fun perimeter(): Double {
        return 2 * 3.14 * radius
    }
}

class Rectangle(
    color: String,
    var sideA: Double,
    var sideB: Double,
) : Figure(color) {
    override fun perimeter(): Double {
        return 2 * (sideA + sideB)
    }

    override fun square(): Double {
        return (sideA * sideB)
    }
}