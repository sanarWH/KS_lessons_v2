package lesson09_task04

fun main() {
    print("Добавление нового рецепта. Напишите название ингридиентов для блюда. " +
            "Каждое блюдо указывайте через запятую с пробелом. \nИгридиенты: ")
    val userInput = readln()

    val listOfIngredients: MutableList<String> = mutableListOf()
    listOfIngredients.add(userInput)

    print(listOfIngredients)

    listOfIngredients.sortedBy { it.first() } //не понимаю как отсортировать по алфавиту

    println(listOfIngredients)
}