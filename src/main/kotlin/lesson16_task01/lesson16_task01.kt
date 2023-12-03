package lesson16_task01

fun main() {
    val x = Cube().getRandomNumber()
    println(x)
}

class Cube() {
    private val randomNumber = (1..6).random()

    fun getRandomNumber(): Int {
        return randomNumber
    }
}