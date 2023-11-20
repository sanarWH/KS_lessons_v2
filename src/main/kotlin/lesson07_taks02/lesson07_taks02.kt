package lesson07_taks02

fun main() {
    val arrayOfOlivie = arrayOf("картошка", "морковка", "яйцо", "колбаса", "огурцы", "горошек", "майонез")

    print("Какой ингридиент вы хотите найти? Введиет название ингридиента: ")
    val userInput = readln()

    for(search in arrayOfOlivie){
        if (search == userInput) println("Ингридиент $search есть в рецепте")
        else if (search != userInput) println("Такого ингридиента в рецепте нет") //не понимаю как сделать адекватный вывод этой строки
    }




}