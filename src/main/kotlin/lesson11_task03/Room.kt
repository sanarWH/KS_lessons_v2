package lesson11_task03

class RoomX(
    var cover: String,
    var name: String,
    var listOfUserPhoto: MutableList<String>,
    var isMicOn: Boolean = true,
    var isUserMuted: Boolean = false,
    var listOfUserName: MutableList<String>,
) {
    fun inConsole(){
        println("""
            Фото комнаты: $cover
            Имя комнаты: $name
            Фото участников комнаты: $listOfUserPhoto
        """.trimIndent())
    }
    fun nickname(){
        for ((index, value) in listOfUserName){
            println("Имя участника ${listOfUserPhoto.get(value)} - ${listOfUserName.get(value)}")
        }
        var userName = ""
        for(i in listOfUserPhoto){
            userName = i
        }
        print("Никнем какого участника вы хотите узнать? Ответ:")
        val userInput = readln()
        if (userInput == userName) println("Никнейм этого юзера: $userName")

    }
    fun userStatus(){
        for (i in listOfUserPhoto){
            println("Микрофон участника $i включен: $isMicOn. Заглушен: $isUserMuted")
        }
    }
}
