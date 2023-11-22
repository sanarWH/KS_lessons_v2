package lesson09_task03

fun main() {
    val listOfOmlet: MutableList<String> = mutableListOf("test", "test2")
    listOfOmlet.add(2, "яйцо")
    listOfOmlet.add(50, "молоко")
    listOfOmlet.add(15, "сливочное масло")
    println(listOfOmlet)


}