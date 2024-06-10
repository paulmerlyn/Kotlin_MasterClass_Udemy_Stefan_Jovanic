package model

fun main() {
    val duck1 = Duck()
    println(duck1.canFly)   // false
    println(duck1.legs) // 2
    println(duck1.toString())
}

open class Bird(open val canFly: Boolean = true) {
    val legs = 2
}

class Duck(override val canFly: Boolean = false) : Bird() {
    val canSwim = true
}