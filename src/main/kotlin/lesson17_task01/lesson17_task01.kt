package lesson17_task01

fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")
//    println("old value: ${fish.isTranslated}")
//    fish.nerveSignalLevel = 400
//    println("new value: ${fish.nerveSignalLevel}")
//    println("new value: ${fish.isTranslated}")

    val fish2 = BabelFish(2)
    println("old value: ${fish2.nerveSignalLevel}")

    val fish3 = BabelFish(21)
    println("old value: ${fish3.nerveSignalLevel}")

}

class BabelFish(
    private val coefficient: Int?
) {

    var isTranslated = false

    var nerveSignalLevel = 200
        get() = if (coefficient != null) field  * coefficient else field
        set(value: Int) {
            field = value
            if (value > 300){
                isTranslated = true
                println("isTranslated = true")
            }
        }
}