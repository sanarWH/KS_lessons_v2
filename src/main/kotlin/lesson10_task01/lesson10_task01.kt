package lesson10_task01

fun main() {
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

    if (userValue > pcValue) println("Победил человек")
    else if (userValue == pcValue) println("Ничья")
    else println("Победил компьютер")
}

fun getRandomNumber(): Int = (1..6).random()



