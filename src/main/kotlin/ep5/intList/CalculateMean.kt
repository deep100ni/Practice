package ep5.intList

fun calculateMean(list: List<Int>): Float {
    return calculateSum(list).toFloat() / list.size
}
fun main(){
    println(calculateMean(listOf(1,2,3,4,40)))
}