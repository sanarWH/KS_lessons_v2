package lesson10_task03

fun main() {
    println("Эта программа поможет вам сгенерировать случайны пароль. \n")
    Thread.sleep(1000)
    print("Какой длины пароль вы хотите сгененрировать? Ответ: ")
    val length = readln().toInt()
    println("Ваш сгенерированный пароль: ${passwordGenerator(length)}")
}

fun passwordGenerator(lengthPassword: Int): String {
    val number = 0..9
    val symbol = ' '..'/'
    var password: String = ""

    while (password.length < lengthPassword) {
        password += number.random()
        if (password.length % 2 == 0) password += symbol.random()
    }
    return password
}