package lesson18_taks02

fun main() {
    val a = FourSides().roll()
    val b = SixSides().roll()
    val c = EightSides().roll()
}

open class GetRandomNumber(val sides: Int) {

    open fun roll() {
        val randomNumber = (1..sides).random()
        println("Выпало число: $randomNumber")
    }
}

class FourSides : GetRandomNumber(4)

class SixSides : GetRandomNumber(6)

class EightSides : GetRandomNumber(8)