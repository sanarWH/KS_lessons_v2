package lesson15_task02

fun main() {

}

abstract class WeatherStationStats()
class Temperature(val temp: Int) : WeatherStationStats()

class PrecipitationAmount(val fallout: Int) : WeatherStationStats()
class WeatherServer(){

    fun getTemperature() {

    }

    fun getPrecipitation(){

    }
}