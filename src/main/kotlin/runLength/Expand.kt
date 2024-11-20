package runLength

import parseDigit

fun expand(str:String):String{
    if (str.isBlank()) return ""
    return buildString {
        var i = 0
        var j = 1
        while (j < str.length){
            val f = parseDigit(str[i])
            val c = str[j]
            append(multiply(f,c))
            i += 2
            j += 2

        }
    }

}

fun multiply(f: Int, c: Char): String {
    return buildString {
        repeat(f) { append(c) }
    }
}

fun main() {
    println(expand("1A3A3B"))

}