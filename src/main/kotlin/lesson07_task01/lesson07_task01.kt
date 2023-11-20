package lesson07_task01

fun main() {

    val arrayOfViews = arrayOf(1, 2, 3, 4, 5, 6, 7)

    arrayOfViews[0] = 1745
    arrayOfViews[1] = 2342
    arrayOfViews[2] = 2967
    arrayOfViews[3] = 2136
    arrayOfViews[4] = 2764
    arrayOfViews[5] = 2998
    arrayOfViews[6] = 3221

    println("""Просмотров рекламы за неделю: ${arrayOfViews[0] + arrayOfViews[1] + arrayOfViews[3] + 
            arrayOfViews[4] + arrayOfViews[5]+ arrayOfViews[6]}""")


}