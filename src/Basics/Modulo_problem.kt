package Basics

import kotlin.math.pow

fun main(){
    val y = Integer.valueOf(readLine())
    product(y)
}

inline fun product(a:Int){
    val x:List<Int> = readLine()!!.split(" ".toRegex()).map(String:: toInt)
    var product: Double = 1.0
    for(i in 0 until a){
        product = (product*x[i])%(10.0.pow(9) + 7)
    }
    println(product.toInt())
}