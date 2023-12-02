package lesson10_task02

fun main() {
    print("Окно регистраици. \nВведите логин (минимум 4 символа): ")
    val userLogin = readln()
    print("Окно регистраици. \nВведите пароль (минимум 4 символа): ")
    val userPassword = readln()
    if (checkPasswordLength(userLogin) && checkPasswordLength(userPassword))
        println("Добро пожаловать!")
    else println("Логин или пароль недостаточно длинные")
}

fun checkPasswordLength(incomingString: String): Boolean {
    return incomingString.length > 3
}
