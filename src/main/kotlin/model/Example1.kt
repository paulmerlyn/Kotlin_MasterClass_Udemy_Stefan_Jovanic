package model

fun main() {
    val person = Person("Alice")
    person.sayHello()
    println(person.myList.takeIf { it.toString() === "red" })

    val mySet = setOf(1, 2, 3, 2 ,1, 4)
    println(mySet) // [1, 2, 3, 4]
    println(mySet.contains(element = 4))    // true

    println(mySet subtract setOf(1, 2))  // [3, 4]
    println(mySet intersect setOf(5, 3, 2, 4)) // [2, 3, 4]

    val myMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    for (entry in myMap) {
        println("${entry.key} -> ${entry.value}")
    }
    for ((key, value) in myMap) {
        println("$key -> $value")
    }
    myMap.forEach { println(it) }

    val myFilteredMap = myMap.filter {
        it.key.length > 3
    }
    println(myFilteredMap)
}

fun sum(vararg numbers: Int): Int {
    var total = 0
    for (num in numbers) {
        total += num
    }
    return total
}


class Person(val name: String) {
    fun sayHello() {
        println("Hello, $name!")
    }

    var myList = listOf<String>("red", "green", "", "", "blue")
    var myMutableList = mutableListOf("bacon", "eggs", "toast")
}