package Basics

import kotlin.math.floor

fun main(){
    val x:Int = Integer.valueOf(readLine())
    sum(x)
}
fun sum(a:Int){
    var k:Int = 0
    for(i in 1..a){
        for (j in 1 until i) {
            if (i == j || i % j == 0) {
                continue
            }
            else
                k+=(i/j)
        }
    }
   // for (i in 1..a)
      //  k+=i
    print(k)
}