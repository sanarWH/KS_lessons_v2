package lesson07_task01

fun main() {
    val rangeNumber = 1..9
    val rangeLetter = 'a'..'z'
    var password: String = ""

    do {
        password += rangeNumber.random()
        password += rangeLetter.random()
    } while (password.length < 6)
    print(password)
}