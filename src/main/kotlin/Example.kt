import kotlin.random.Random

fun main() {
    println("Hello, Kotlin!".bold())   // <b>Hello, Kotlin!</b>

    when (val number = Random.nextInt(from = 1, until = 10)) {
        in 1..4 -> println("Number $number is below 5")
        in 6..10 -> println("Number $number is above 5")
        else -> println("Number $number is in the middle")
    }

    val myPair = Pair("foo", 77)
    println(myPair.first)   // foo
    val (myFirst, mySecond) = myPair
    println(mySecond)    // 77

    val regularString = "Hello, Kotlin!"
    val nullString = null  // null (defaults to type String?
    // val anotherNullString: String = null  // compilation error
    var nullableString: String? = "hello"
    nullableString = null

    println(regularString.length)   // 14
    //println(nullableString.length) // null
}

fun String.bold() = "<b>$this</b>"