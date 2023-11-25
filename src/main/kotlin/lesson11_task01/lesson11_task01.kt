package lesson11_task01

fun main() {
    val user1 = UserData(
        identifier = 1001,
        login = "mike",
        password = "MikeWazowski",
        mail = "mike11@mail.com"
    )
    val user2 = UserData(
        identifier = 1002,
        login = "sally",
        password = "SallySalivan",
        mail = "sally11@mail.com"
    )
    println("""Данные пользователя1: 
        |идентификатор: ${user1.identifier}
        |логин: ${user1.login}
        |пароль: ${user1.password}
        |почта: ${user1.mail}
    """.trimMargin())
    println()
    println("""Данные пользователя2: 
        |идентификатор: ${user2.identifier}
        |логин: ${user2.login}
        |пароль: ${user2.password}
        |почта: ${user2.mail}
    """.trimMargin())
}
class UserData(
    val identifier: Int,
    val login: String,
    val password: String,
    val mail: String,
) {
}