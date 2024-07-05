fun trim(str: String,char:Char): String {
    return buildString {
        var start = 0
        var end = 0
        for(i in str.indices){
            if(str[i] != char){
                start = i
                break
            }
        }
        for(i in str.lastIndex downTo 0){
            if(str[i] != char){
                end = i
                break
            }
        }
        for (i in start..end){
            append(str[i])
        }
    }
}

fun main() {
    println(trim("+-+-+",'+'))
}
