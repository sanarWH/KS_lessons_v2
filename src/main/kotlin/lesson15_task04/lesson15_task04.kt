package lesson15_task04

fun main() {
    val drum = Instrument("барабан", 3)
    drum.search()
}
class Instrument(val name: String, val amount: Int) : Search {
    override fun search() {
        println("Поиск комплектующих к инструменту $name")
    }
}

class Components(val name: String, val amount: Int)

interface Search{
    fun search()
}



