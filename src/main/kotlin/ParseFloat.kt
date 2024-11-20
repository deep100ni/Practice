import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.roundToInt

fun parseDigit(digit:Char):Int {
    if(digit in '0'..'9') return digit.code - 48 else return -1
}

fun parseNumber(numstr: String):Int{
    var num = 0
    for (char in numstr) {
        if(char in '0'..'9'){
            num = num * 10 + parseDigit(char)
        }
    }
    return num
}

fun parseInt(num : String): Int {
    var res = 0.0
    var exp = num.length-1
    for (c in num){
        val d = parseDigit(c)
        res += d * 10.0.pow(exp.toDouble())
        exp--
    }
    return res.roundToInt()
}

fun fractionalPartDigit(numstr: String):Int{
    var pointHasCome = false
    var fractionalPart = 0
    for (char in numstr){
        if (char == '.'){
            pointHasCome = true
        }else if (pointHasCome){
            fractionalPart++
        }
    }
    return fractionalPart
}

fun parseDecimalNo(numstr: String):Float{
    var num = 0f
    var parseDN = 0f
    var fpd =fractionalPartDigit(numstr)
    for (char in numstr){
        if (char in '0'..'9'){
            num = num * 10 + parseDigit(char)
        }
    }
    if (fpd>0){
        repeat(fpd){
        	parseDN = num/10
        	num /= 10
    	}
        return parseDN
    }
    return num
}

fun main(){
//    print(parseDecimalNo("."))
    println(parseInt("1234"))
}