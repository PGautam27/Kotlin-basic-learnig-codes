package Basics

fun main(){
    val x: Int = Integer.valueOf(readLine())
    val y = readLine()!!.replace(".","B")
    var s:Int = 0
    for (i in 0 until y.length-1){
        if ((y[i].toString() =="H" && y[i+1].toString() == "H")||x!=y.length ){
            println("No")
            break
        }
        ++s
    }
    if(s==y.length-1){
        println("Yes")
        println(y)
    }
}