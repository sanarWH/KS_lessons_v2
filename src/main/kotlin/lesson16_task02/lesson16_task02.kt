package lesson16_task02

fun main() {
    val circle1 = Circle()
    println(circle1.perimeter(6.4))
    println(circle1.square(6.4))

}

class Circle() {
    private val Pi = 3.14
    fun perimeter(radius: Double): Double {
        return 2 * Pi * radius
    }

    fun square(radius: Double): Double {
        return Pi * (radius * radius)
    }
}