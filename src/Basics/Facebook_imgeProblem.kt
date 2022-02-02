package Basics

fun check(a:Int,b:Int?,c:Int?){
    if(a> b!! || a>c!!){
        println("UPLOAD ANOTHER")
    }
    else if(b==c){
        println("ACCEPTED")
    }
    else{
        println("CROP IT")
    }
}

fun main(){
    val length = Integer.valueOf(readLine())
    val iteration = Integer.valueOf(readLine())
    var width: Array<Int?> = arrayOfNulls(iteration)
    var height: Array<Int?> = arrayOfNulls(iteration)
    for (i in 0 until iteration){
        var x = readLine()!!.split(" ".toRegex()).map (String::toInt)
        width[i] = x[0]
        height[i] = x[1]
    }
    for (j in 0 until iteration){
        check(length,width[j],height[j])
    }
}