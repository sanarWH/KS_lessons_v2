package lesson13_task03

fun main() {
    val user1 = DataBaseV3("Mike", 89507659104)
    val user2 = DataBaseV3("Tike", 89507659105)
    val user3 = DataBaseV3("Pike", 89507659106, "null")
    val user4 = DataBaseV3("Rike", 89507659106, "Disk")
    val user5 = DataBaseV3("Wike", 89507659106)
    val listOfUser = listOf(user1.getData(), user2.getData(), user3.getData(), user4.getData(), user5.getData())
    println(listOfUser)
}

class DataBaseV3(var nameOfUser: String, var number: Long, var nameOfCompany: String? = null) {

    fun getData() {
        println("""
            Имя: $nameOfUser
            Телефон: $number
            Компания: ${nameOfCompany ?: "не указано"}
        """.trimIndent()
        )
    }
}
