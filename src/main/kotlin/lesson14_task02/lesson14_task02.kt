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