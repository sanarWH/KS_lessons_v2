package lesson09_task02

fun main() {
    var listOfSalad = mutableListOf("помидор", "огурец", "майонез")

    println("В рецепте есть базовые ингридиенты: $listOfSalad")

    print("Желаете добавить еще? да/нет. Ответ: ")
    val userInput = readln()
    var userInput2 = ""

    if (userInput == "да") {
        print("Какой ингридиент еще хотите добавить? Ответ: ")
        userInput2 = readln()
        listOfSalad.add(userInput2)
        println("Теперь в рецепте есть следующие ингридиенты: $listOfSalad")
    } else (println("Рецепт остался без изменений."))
}