package Basics

fun main(){
    val k = readLine()
    zoo(k.toString())
}

fun zoo(a:String){
    var x:Int = 0
    var y:Int = 0
    if (a.length> 20){
        print("No")
        return
    }
    for (i in a){
        if (i=='z')
            ++x
        else
            ++y
    }
    if (y == (x*2)){
        print("Yes")
    }
    else
        print("No")
}