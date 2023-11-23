package lesson09_task03

fun main() {

    val listOfOmlet: MutableList<Int> = mutableListOf(2, 50, 15)
    print("Сколько порций омлета вы хотите приготовить? Ответ: ")
    val userInput = readln().toInt()

    val listOfOmlet2 = listOfOmlet.map { it * userInput }
    println(
        """Для приготовления $userInput порций омлета нужно взять:
        |яиц: ${listOfOmlet2[0]} шт.
        |молока: ${listOfOmlet2[1]} мл.
        |сливочного масла: ${listOfOmlet2[2]} гр.
    """.trimMargin()
    )
}