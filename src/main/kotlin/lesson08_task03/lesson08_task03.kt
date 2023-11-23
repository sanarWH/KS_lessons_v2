package lesson08_task03

fun main() {
    val arrayOfOlivie = arrayOf("картошка", "морковка", "яйцо", "колбаса", "огурцы", "горошек", "майонез")

    print("Какой ингридиент вы хотите найти? Введиет название ингридиента: ")
    val userInput = readln()

    if (userInput in arrayOfOlivie) {
        println("Ингридиент $userInput есть в рецепте")
    } else println("Такого ингридиента в рецепте нет")
}
