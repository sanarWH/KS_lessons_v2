package lesson10_task03

fun main() {
    println("Эта программа поможет вам сгенерировать случайны пароль. \n")
    Thread.sleep(1000)
    passwordGenerator()
}

fun passwordGenerator() {
    val number = 0..9
    val letter = 'a'..'z'
    val letterBig = 'A'..'Z'
    val symbol = '\u0020'.. '\u002F'
    var password: String = ""
    print("Какой длины пароль вы хотите сгененрировать? Ответ: ")
    val length = readln().toInt()

    while (password.length < length){
        password += number.random()
        password += letter.random()
        password += letterBig.random()
        password += symbol.random()
    }

    val passwordRandom = password.toList().shuffled().joinToString("")
    print("Ваш случайно сгенерированный пароль из $length символов: $passwordRandom")
}