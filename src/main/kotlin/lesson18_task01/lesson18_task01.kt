package lesson18_task01

fun main() {
    val order = InformationAboutOrder()
    order.information(
        1357,
        "Phone"
    )
    println()
    order.information(
        1358,
        listOf("Phone", "Power cable", "Headphones")
    )

}

class InformationAboutOrder {

    fun information(
        numberOfOrder: Int,
        goods: String,
    ) {
        println("Номер заказа: $numberOfOrder.\nЗаказан товар: $goods")
    }

    fun information(
        numberOfOrder: Int,
        goods: List<String>,
    ) {

        println("Номер заказа: $numberOfOrder.\nЗаказаны следующие товары: $goods")
    }

}