package Basics

fun divisible(i: Int, r: Int, k: Int): Int{
    var j:Int = 0
    for(l in i..r){
        if(l%k == 0){
            ++j
        }
    }
    return j
}

fun main(){
    var items:List<Int> = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    val a:Int = items[0]
    val b:Int = items[1]
    val c:Int = items[2]
    val s: Int = divisible(a,b,c)
    println(s)
    val i = readLine()!!.split(" ".toRegex()).map(String::toInt)
    println(i[1])
    println(i[0])
    println(i[2])
    val d = i[0]
    val e = i[1]
    val f = i[2]
    val k: Int = divisible(d,e,f)
    println(k)
}