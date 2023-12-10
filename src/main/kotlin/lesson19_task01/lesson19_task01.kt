package lesson19_task01

fun main() {
    val fish = Fish.values()
    println("Вы можете добавить в свой аквариум следующих рыб:")
    for (i in fish) {
        println(i.id)
    }

}

enum class Fish(val id: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}
