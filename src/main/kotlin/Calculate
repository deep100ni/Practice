fun calculate(expression: String): Int {
    var result = 0
    var currentNumber = 0
    var isPositive = true
    for (char in expression) {
        if (char in "+-") {
            result += if (isPositive) currentNumber else -currentNumber
            currentNumber = 0
            isPositive = (char == '+')
        } else if (char in '0'..'9') {
            currentNumber = currentNumber * 10 + (char.code - 48)
        }
    }
    result += if (isPositive) currentNumber else -currentNumber
    return result
}

fun main() {
    println(calculate("-2-3+10")) 
}