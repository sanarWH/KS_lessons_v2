package lesson19_task02

fun main() {

}

enum class ProductCategories {
    CLOTHES,
    STATIONERY,
    OTHER,
}

fun getNameOfCategory(name: ProductCategories){
    when (name){
        ProductCategories.CLOTHES -> println("Одежда")
        ProductCategories.STATIONERY -> println("Канцелярские товары")
        ProductCategories.OTHER -> println("Разное")
    }
}