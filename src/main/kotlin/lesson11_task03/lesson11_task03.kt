package lesson11_task03

fun main() {
    val room1 = Room(
        name = "kotlin",
        cover = "Фото логотипа котлин",
        listOfUserPhoto = mutableListOf("фото1", "фото2", "фото3"),
        listOfUserName = mutableListOf("user1", "user2", "user3")
    )
    room1.inConsole()
    room1.userStatus()
}