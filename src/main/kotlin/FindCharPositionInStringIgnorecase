fun find(str: String,char: Char, ignorecase : Boolean): String {
    return buildString {
        var code = char.code
        if (char in 'A'..'Z'){
            code += 32
        }else{
            code -= 32
        }
        var char1 = Char(code)
        var isFound = false
        for (i in str.indices){
            if(str[i] == char || (str[i] == char1 && ignorecase)){
                isFound= true 
                append ("Found at $i \n")
            }
        }
        if (! isFound){
            append("Not Found")
        }  
        
    }
}



fun main() {
    print(find("coOld",'o', true))
}