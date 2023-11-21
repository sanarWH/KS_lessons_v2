package lesson09_task01

fun main(){

    val listOfOlivie = listOf("картошка", "морковка", "яйцо", "колбаса", "огурцы", "горошек", "майонез")

    println("В рецепте есть следующие ингридиенты:")
    listOfOlivie.forEach{
        println(it)
    }
}