package ep5.intList

fun findMax(list: List<Int>): Int? {
    if (list.isEmpty())return null
    var max =  list.first()
    for (element in list){
        if (element > max) max = element
    }
    return max
}
fun main(){
    println(findMax(listOf(23,43,67,64,34,24)))
}