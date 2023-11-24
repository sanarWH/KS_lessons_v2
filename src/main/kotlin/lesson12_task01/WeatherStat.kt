package lesson12_task01

class WeatherStat(dayWeather: Int, nightWeather: Int, isRain: Boolean) {
    var dayWeather = dayWeather
    var nightWeather = nightWeather
    var isRain = isRain

    fun inConsole(){
        println("""Дневная температура: $dayWeather
            |Ночная температура: $nightWeather
            |Наличие осадков в течение суток: $isRain
        """.trimMargin())
    }
}