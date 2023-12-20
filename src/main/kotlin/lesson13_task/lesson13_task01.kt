package lesson13_task

fun main() {
    val user1 = DataBase("Mike", 89658534288, "")
    println(user1.nameOfUser)
    println(user1.number)
    println(user1.nameOfCompany)
}

class DataBase(val nameOfUser: String, val number: Long, val nameOfCompany: String?)