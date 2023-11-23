package lesson10_task04

fun main() {
    game()
    print("Хотите бросить кости еще раз? Введите Да или Нет. Ответ: ")
    val userInput = readln()

    if (userInput == "Да") {
        game()
    } else println("Человек выиграл ${counter()} раундов. Компьютер выиграл ${counter()} раундов")

}

fun game() {
    val userValue = getRandomNumber()
    print("Ход человека. \nЗначения на кубиках: ")
    Thread.sleep(1000)
    println(userValue)

    Thread.sleep(1000)

    val pcValue = getRandomNumber()
    print("Ход компьютера. \nЗначение на кубиках: ")
    Thread.sleep(1000)
    println(pcValue)

    Thread.sleep(1000)

    if (userValue > pcValue) return println("Победил человек")
    else if (userValue == pcValue) println("Ничья")
    else return println("Победил компьютер")
}

fun getRandomNumber(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

fun counter() {
    var counetrHuman = 0
    var counterPC = 0
    if (game() == "Победил человек") {
        counetrHuman += 1
    } else if (game() == "Победил компьютер") {
        counterPC += 1
    }

}