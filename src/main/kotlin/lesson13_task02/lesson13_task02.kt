package lesson13_task02

fun main() {
    val user1 = DataBaseV2("Mike", 89507639413)
    user1.getData()
}

class DataBaseV2(var nameOfUser: String, var number: Long, var nameOfCompany: String? = "") {


    fun getData() {
        if (nameOfCompany == null || nameOfCompany == "") nameOfCompany = "не указано"

        println(
            """
            Имя: $nameOfUser
            Телефон: $number
            Компания: $nameOfCompany
        """.trimIndent()
        )
    }

}