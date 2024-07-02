fun find(str: String,char: Char): String {
    return buildString {
        var isFound = false
        for (i in str.indices){
            if(str[i] == char){
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
    print(find("cold",'p'))
}
