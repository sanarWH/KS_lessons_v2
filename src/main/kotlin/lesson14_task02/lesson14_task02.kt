package lesson14_task02

fun main() {
    val liner1 = LinerV2("liner1", 40, 1000, 200)
    val cargo1 = CargoV2("cargo1", 30, 100, 600)
    val iceShip1 = IceshipV2("iceShip1", 20, 50, 100)

    liner1.inConsole()
    println()
    cargo1.inConsole()
    println()
    iceShip1.inConsole()
    println()
}

open class LinerV2(
    val name: String,
    val speed: Int,
    val passenger: Int,
    val lifting: Int,
    val isIceDestroyer: Boolean = false,
    val method: String = "Лайнер выдвигает горизонтальный трап со шкафута",
) {
    fun inConsole() {
        println(
            """
            Имя коробля: $name
            Скорость корабля: $speed
            Сколько пассажиров вмещается: $passenger
            Грузоподъемность: $lifting
            Может ли ломать лед: $isIceDestroyer
            Метод погрузки: $method
        """.trimIndent()
        )
    }
}

class IceshipV2(
    name: String,
    speed: Int,
    passenger: Int,
    lifting: Int,
    isIceDestroyer: Boolean = true,
    method: String = "Ледокол открывает ворота со стороны кормы",

    ) : LinerV2(name, speed, passenger, lifting, isIceDestroyer, method) {
}

class CargoV2(
    name: String,
    speed: Int,
    passenger: Int,
    lifting: Int,
    isIceDestroyer: Boolean = false,
    method: String = "Грузовой корабль активирует погрузочный кран",


    ) : LinerV2(name, speed, passenger, lifting, isIceDestroyer, method) {
}