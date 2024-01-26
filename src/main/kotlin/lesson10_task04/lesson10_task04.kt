package lesson10_task04

fun main() {
    startTheGame()
    print("Хотите бросить кости еще раз? Введите Да или Нет. Ответ: ")
    val userInput = readln().lowercase()

    if (userInput == "да") {
        startTheGame()
    } else if(userInput == "нет") getCounter()

}

fun startTheGame(): Int {
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

    var checkForCounter: Int = 0 //возвращаемое значение. Тип Boolean не подходит, потому что может быть ничья

    if (userValue > pcValue) {
        println("Победил человек")
        checkForCounter = 1
        return checkForCounter
    } else if (userValue == pcValue) {
        println("Ничья")
        checkForCounter = 2
        return checkForCounter
    } else {
        println("Победил компьютер")
        checkForCounter = 3
        return checkForCounter
    }
}

fun getRandomNumber(): Int {
    return (1..6).random()
}

fun getCounter() {
    var counterHuman = 0
    var counterPC = 0
    var counterDraw = 0

    if (startTheGame() == 1) counterHuman += 1
    else if (startTheGame() == 2) counterDraw += 1
    else if (startTheGame() == 3) counterPC += 1

    return println("Человек выиграл $counterHuman раундов. Компьютер выиграл $counterPC раундов. Ничьи: $counterDraw")
}