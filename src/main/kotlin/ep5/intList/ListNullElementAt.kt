package ep5.intList

fun nullElementAt(list: List<Int>,index: Int): Int?{
    if (index !in list.indices) return null
    return list[index]
}
fun main(){
    print(nullElementAt(list = listOf(23,43,67,64,34,24), index = 23))
}