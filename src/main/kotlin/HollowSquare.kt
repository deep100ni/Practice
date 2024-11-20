fun printHoloSquare(size: Int) {
    println("*".repeat(size))
    for (i in 2 until size) {
        println("*" + " ".repeat(size - 2) + "*")
    }
    if (size > 1) {
        println("*".repeat(size))
    }
}

fun main() {
    printHoloSquare(5)
}