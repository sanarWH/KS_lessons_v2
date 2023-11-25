package lesson12_task01

fun main() {
    var day1 = WeatherStat(25, 15, false)
    var day2 = WeatherStat(21, 14, true)

    day1.inConsole()
    day2.inConsole()
}

class WeatherStat(dayWeather: Int, nightWeather: Int, isRain: Boolean) {
    var dayWeather = dayWeather
    var nightWeather = nightWeather
    var isRain = isRain

    fun inConsole() {
        println(
            """Дневная температура: $dayWeather
            |Ночная температура: $nightWeather
            |Наличие осадков в течение суток: $isRain
        """.trimMargin()
        )
    }
}