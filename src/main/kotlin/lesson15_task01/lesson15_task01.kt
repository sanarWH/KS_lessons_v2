package lesson15_task01

fun main() {
    val crucian = Crucian()
    val gull = Gull()
    val duck = Duck()

    crucian.swim()
    gull.fly()
    gull.swim()
    duck.fly()
    duck.swim()
}

class Crucian() : SwimmingCreature {
    override fun swim() {
        println("Карась может плавать")
    }
}

class Gull() : FlyingCreature, SwimmingCreature {
    override fun fly() {
        println("Чайка может летать")
    }

    override fun swim() {
        println("Чайка может плавать")
    }
}

class Duck() : FlyingCreature, SwimmingCreature {
    override fun fly() {
        println("Утка может летать")
    }

    override fun swim() {
        println("Утка может плавать")
    }
}

interface FlyingCreature {
    fun fly()
}

interface SwimmingCreature {
    fun swim()
}