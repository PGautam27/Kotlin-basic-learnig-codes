package Basics

fun main(){
    val c:Int = Integer.valueOf(readLine())
    val y = readLine()!!.split(" ".toRegex()).map(String::toInt)
    val x = Integer.valueOf(readLine())
    var arr:Array<Int?> = arrayOfNulls(x)
    for (i in 0 until x){
        var z = readLine()!!.split(" ".toRegex()).map(String::toInt)
        arr[i]=validate(z[0],z[1],z[2])!!
    }
    for (i in arr){
        println(i)
    }
}
inline fun validate(a:Int,b:Int,c:Int):Int{
    var k:Int = 0
    for (i in a..b){
        if (i%c == 0){
            ++k
        }
    }
    return k
}