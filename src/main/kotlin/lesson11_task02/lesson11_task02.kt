package lesson11_task02

fun main() {
    val user1 = UserData(
        identifier = 1001,
        login = "mike",
        password = "MikeWazowski",
        mail = "mike11@mail.com",
    )
    user1.inConsole()
    user1.addBio()
    user1.changePassword()
    user1.inConsole()
}
class UserData(
    val identifier: Int,
    var login: String,
    var password: String,
    var mail: String,
    var bio: String = "empty",

    ) {
    fun inConsole(){
        println("""Данные пользователя: 
        |идентификатор: $identifier
        |логин: $login
        |пароль: $password
        |почта: $mail
        |био: $bio
    """.trimMargin())
    }
    fun addBio(){
        print("Добавление данных во вкладку \"О себе\". Введите текст: ")
        bio = readln()
    }
    fun changePassword(){
        print("Введите ваш текущий пароль: ")
        val oldPassword = readln()
        if (oldPassword == password){
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен.")
        } else println("Пароль введен неверно")
    }
}