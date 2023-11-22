package lesson07_task01

fun main() {

    val arrayOfViews = arrayOf(1745, 2342, 2967, 2136, 2764, 2998, 3221)

    var sumArray = 0
    for (i in arrayOfViews) {
        sumArray += i
    }
    println("Просмотров рекламы за неделю: $sumArray")
}