package ep5

fun elementAt(list: List<Int>,index: Int): Int{
    return list[index]
}
fun main(){
    print(elementAt(list = listOf(23,43,67,64,34,24), index = 2))
}