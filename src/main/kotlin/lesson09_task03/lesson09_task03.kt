package lesson09_task03

fun main() {

    println("Ингридиенты указываются в таком порядке: яйца, молоко, сливочное масло")

    val listOfOmlet: MutableList<Int> = mutableListOf(2, 50, 15)
    print("Сколько порций омлета вы хотите приготовить? Ответ: ")
    val userInput = readln().toInt()

    for (i in listOfOmlet) {
        val value = i * userInput
        println("Для приготовления $userInput порций потребуется взять: $value")
    }
}