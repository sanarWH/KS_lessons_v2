package lesson15_task03

fun main() {
    val admin = Admin()
    println("Окно с кнопками админа:")
    admin.deleteMessage()
    admin.deleteUser()
    admin.readMessage()
    admin.sendMessage()

    val user1 = User()
    println("Окно с кнопками юзера:")
    user1.readMessage()
    user1.sendMessage()

}

abstract class Privileges : AdminFunctions, UserFunctions {
    abstract val isAdmin: Boolean
    abstract val isReadMessage: Boolean
    abstract val isSendMessage: Boolean
    abstract val isDeleteMessage: Boolean
    abstract val isDeleteUser: Boolean
}

interface AdminFunctions {
    fun deleteMessage()

    fun deleteUser()
}

interface UserFunctions {
    fun sendMessage()

    fun readMessage()
}

class Admin(
    override val isAdmin: Boolean = true,
    override val isReadMessage: Boolean = true,
    override val isSendMessage: Boolean = true,
    override val isDeleteMessage: Boolean = true,
    override val isDeleteUser: Boolean = true
) : Privileges() {
    override fun deleteMessage() {
        println("Доступна кнопка удалить сообщение")
    }

    override fun deleteUser() {
        println("Доступна кнопка удалить юзера")
    }

    override fun sendMessage() {
        println("Доступна кнопка отправить сообщение")
    }

    override fun readMessage() {
        println("Доступна кнопка прочитать сообщение")
    }
}

class User(
    override val isAdmin: Boolean = false,
    override val isReadMessage: Boolean = true,
    override val isSendMessage: Boolean = true,
    override val isDeleteMessage: Boolean = false,
    override val isDeleteUser: Boolean = false
) : Privileges() {
    override fun deleteMessage() {
        TODO("Not yet implemented")
    }

    override fun deleteUser() {
        TODO("Not yet implemented")
    }

    override fun sendMessage() {
        println("Доступна кнопка отправить сообщение")
    }

    override fun readMessage() {
        println("Доступна кнопка прочитать сообщение")
    }
}
