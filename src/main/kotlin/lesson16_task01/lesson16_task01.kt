package lesson16_task01

fun main() {
    val x = Cube()
    x.getRandomNumber()
    x.printRandomNumber()

}

class Cube() {
    private val randomNumber = (1..6).random()

    fun getRandomNumber(): Int {
        return randomNumber
    }
    fun printRandomNumber(){
        println(getRandomNumber())
    }
}