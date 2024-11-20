fun replace(str: String,char:Char,rep:Char): String {
    return buildString {
        for (c in str){
            if (c == char){
                append(rep)
            }else{
                append(c)
            }
        }
    }
}



fun main() {
    println(replace("Koop",'o','e'))
}
