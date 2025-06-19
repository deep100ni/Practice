fun main(){
    val list = mutableListOf(9,7,2,1,-1)
    println(list)
    reverseInPlace(list)
    val list1 = reverseNewList(list)
    println(list)
    println(list1)
}

fun reverseInPlace(list : MutableList<Int>){
    for(i in 0..< list.size/2){
        val temp = list[i]
        list[i] = list[list.lastIndex - i]
        list[list.lastIndex - i] = temp
    }
}

fun reverseNewList(list : List<Int>): List<Int>{
    return buildList {
        for(i in list.lastIndex downTo 0){
            add(list[i])
        }
    }
}