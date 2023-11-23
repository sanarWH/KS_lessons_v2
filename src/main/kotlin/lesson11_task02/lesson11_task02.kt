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