package ep5.intList

fun calculateSum(list: List<Int>): Int {
    var sum = 0
    // for (el in list) sum += el
    list.forEach { sum += it }
    return sum
}
fun main(){
    println(calculateSum(listOf(1,2,3,4)))
}