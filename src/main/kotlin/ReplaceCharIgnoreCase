fun replace(str: String,char:Char,rep:Char,ignorecase : Boolean): String {
    return buildString {
        var code = char.code
        if (char in 'A'..'Z'){
            code += 32
        }else{
            code -= 32
        }
        var char1 = Char(code)
        for (c in str){
            if (c == char || (c == char1 && ignorecase)){
                append(rep)
            }else{
                append(c)
            }
        }
    }
}



fun main() {
    println(replace("KoOp",'o','e', false))
}
