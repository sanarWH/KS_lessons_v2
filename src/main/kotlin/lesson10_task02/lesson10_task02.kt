package lesson10_task02

fun main() {
    print("Окно регистраици. \nВведите логин: ")
    val userLogin = readln().inputLenght(userLogin)
    print("Окно регистраици. \nВведите пароль: ")
    val userPassword = readln().inputLenght(userPassword)
}
fun inputLength(name: String?): Boolean {
    if (name?.length!! < 4) {
        print("Логин или пароль недостаточно длинные")
    } else (println("Добро пожаловать"))

}