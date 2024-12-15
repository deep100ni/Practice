package ep5

fun NullElementAt(list: List<Int>,index: Int): Int?{
    if (index !in list.indices) return null
    return list[index]
}
fun main(){
    print(NullElementAt(list = listOf(23,43,67,64,34,24), index = 23))
}