package runLength

fun shrink(str: String):String{
    return buildString {
        var count = 1
        var curr = str.first()
        for (i in 1..str.lastIndex){
            if (curr == str[i]){
                count ++
            }else{
                append(count)
                append(curr)
                curr = str[i]
                count =1
            }
        }
        append(count)
        append(curr)

    }
}

fun main() {
    println(
        shrink("AABBBCDDDD")
    )

}