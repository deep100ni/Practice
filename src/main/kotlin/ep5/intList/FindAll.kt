package ep5.intList

fun findAll(list: List<Int>, element: Int): List<Int> {
    return buildList {
        for (i in list.indices){
            if (list[i] == element) add(i)
        }
    }
}
fun main(){
    println(findAll(listOf(23,64,43,67,64,34,24),64))
}


