package lesson14_task01

fun main() {
    val liner1 = Liner("liner1", 40, 1000, 200)
    val cargo1 = Cargo("cargo1", 30, 100, 600)
    val iceShip1 = Iceship("iceShip1", 20, 50, 100)

    liner1.inConsole()
    cargo1.inConsole()
    iceShip1.inConsole()
}

open class Liner(
    val name: String,
    val speed: Int,
    val passenger: Int,
    val lifting: Int,
    val iceDestroyer: Boolean = false
) {
    fun inConsole() {
        println(
            """
            Имя коробля: $name
            Скорость корабля: $speed
            Сколько пассажиров вмещается: $passenger
            Грузоподъемность: $lifting
            Может ли ломать лед: $iceDestroyer
        """.trimIndent()
        )
    }
}

class Cargo(
    name: String,
    speed: Int,
    passenger: Int,
    lifting: Int,
    iceDestroyer: Boolean = false

) : Liner(name, speed, passenger, lifting, iceDestroyer) {
}

class Iceship(
    name: String,
    speed: Int,
    passenger: Int,
    lifting: Int,
    iceDestroyer: Boolean = true

) : Liner(name, speed, passenger, lifting, iceDestroyer) {
}