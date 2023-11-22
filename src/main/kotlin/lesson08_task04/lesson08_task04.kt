package lesson08_task04

fun main() {

    val arrayOfOlivie = arrayOf("картошка", "морковка", "яйцо", "колбаса", "огурцы", "горошек", "майонез")
    println("Список ингридиентов из рецепта: ${arrayOfOlivie.contentToString()}")

    print("Какой ингридиент вы хотите заменить? Ответ: ")
    val userInput = readln()

    if (userInput in arrayOfOlivie) {
        val index = arrayOfOlivie.indexOf(userInput)

        print("На какой ингридиент вы хотите заменить $userInput? Ответ: ")
        val userInput2 = readln()

        arrayOfOlivie[index] = userInput2

        println("Готово! Теперь список ингридиентов выглядит так: ${arrayOfOlivie.contentToString()}")

    } else println("Такого ингридиента нет в рецепте")
}