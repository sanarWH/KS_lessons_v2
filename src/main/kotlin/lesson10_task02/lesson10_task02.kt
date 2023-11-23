package lesson10_task02

fun main() {
    print("Окно регистраици. \nВведите логин (минимум 4 символа): ")
    val userLogin = readln()
    print("Окно регистраици. \nВведите пароль (минимум 4 символа): ")
    val userPassword = readln()
    inputLength(userLogin)
    inputLength(userPassword)
}

fun inputLength(name: String) {
    if (name.length < 4) {
        return print("Логин или пароль недостаточно длинные")
    } else return (println("Добро пожаловать"))
}