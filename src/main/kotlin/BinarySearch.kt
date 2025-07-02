fun binarySearch(list : List<Int>,x : Int) : Int{
    var start = 0;var end = list.lastIndex
    while(start <= end){
        val midIndex = (start + end)/2
        when{
            list[midIndex] == x -> return midIndex
            list[midIndex] > x -> end = midIndex - 1
            else -> start = midIndex + 1
        }
    }
    return -1
}

fun main(){
    val list = listOf<Int>(17,22,28,29,29,43,52,73,83,89)
    val index = binarySearch(list,73)
    println(index)
}