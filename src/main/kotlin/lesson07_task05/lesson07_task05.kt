package lesson07_task05

fun main() {
    val rangeNumber = 1..9
    val rangeLetter = 'a'..'z'
    val rangeLetterBig = 'A'..'Z'
    val passwordLengthMin = 6
    println("Это генератор паролей. Минимальная длина 6 символов. Введите желаемую длину пароля: ")
    val passwordLengthMax = readln().toInt()
    var passwordGenerator: String = ""

    do {
        passwordGenerator += rangeLetter.random()
        passwordGenerator += rangeNumber.random()
        passwordGenerator += rangeLetterBig.random()
    } while (passwordGenerator.length < passwordLengthMax && passwordLengthMax > passwordLengthMin)

    val passwordForUser = passwordGenerator.toList().shuffled().joinToString("")
    println("Ваш случайно сгенерированный пароль: $passwordForUser")

}