package lesson13_task03

class DataBaseV3(var nameOfUser: String, var number: Long, var nameOfCompany: String? = "") {


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

    fun getNameOfCompanyX(){

    }
}