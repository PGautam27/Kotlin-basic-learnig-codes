package Basics

fun main(){
    val c = Integer.valueOf(readLine())
    storeValue(a = c)
}

fun storeValue(a:Int){
    var arr1:Array<Number?> = arrayOfNulls(a)
    var arr2:Array<Number?> = arrayOfNulls(a)
    var arr3:Array<Number?> = arrayOfNulls(a)
    for (i in 0 until a){
        var value = readLine()!!.split(" ".toRegex()).map(String::toLong)
        arr1[i] = value[0]
        arr2[i] = value[1]
        arr3[i] = value[2]
    }
    for (j in 0 until a){
        checkValue(arr1[j]!!,arr2[j]!!,arr3[j]!!)
    }
}

inline fun checkValue(z:Number,m:Number,n:Number) {
    var k: Long = 0
    for (i in 1..m as Long){
        for (j in 1..n as Long){
            if (i*j == z){
                ++k
            }
        }
    }
    println(k)
}
