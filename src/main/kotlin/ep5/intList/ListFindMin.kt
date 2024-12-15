package ep5.intList

fun findMin(list: List<Int>): Int? {
    if (list.isEmpty())return null
    var min =  list.first()
    for (element in list){
        if (element < min) min = element
    }
    return min
}
fun main(){
    println(findMin(listOf(23,43,67,64,34,24)))
}