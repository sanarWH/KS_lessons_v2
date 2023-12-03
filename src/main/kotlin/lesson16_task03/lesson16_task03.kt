package lesson16_task03

fun main() {
    println("Введите логин: ")
    val log = readln()
    println("Введите пароль: ")
    val pass = readln()
    val user1 = UserData(log, pass).check(pass)
    if (user1) {
        println("Добро пожаловать")
    } else println("Пароль введен неверно")

}

class UserData(
    private val login: String,
    private val password: String
) {

    fun check(password: String): Boolean {
        val isPasswordTrue: Boolean =
            password == "password" //в кавычках записан пароль, который должен будет храниться в базе данных. Туда он будет попадать при регестрации
        return isPasswordTrue
    }
}

