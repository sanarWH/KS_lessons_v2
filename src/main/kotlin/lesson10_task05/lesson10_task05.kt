package lesson10_task05

import sun.security.util.Password

fun main() {
    val user1 = DataBase(login = "Mike", password = "Waz123")
    if (authorizeUser(user1.login, user1.password)) println("Добро пожаловать!")
    else println("Данные введены неверно")

}
fun authorizeUser(login: String, password: String): Boolean {
    print("Введите ваш логин: ")
    val userLogin = readln()
    print("Ввеите ваш пароль: ")
    val userPassword = readln()
    if (userLogin == login && userPassword == password){
        return true
    } else return false

}
class DataBase (
    val login: String,
    val password: String,
)