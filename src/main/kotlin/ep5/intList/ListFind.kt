package ep5.intList

fun find(list: List<Int>, element: Int): Int{
    for (i in list.indices){
        if (list[i] == element) return i
    }
    return -1
}

fun main(){
    println(find(listOf(23,43,67,64,34,24),64))
}
