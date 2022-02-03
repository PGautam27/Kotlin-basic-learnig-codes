package Basics


fun main(){
    //val c = Integer.valueOf(readLine())
    val a:Long = readln().toLong()
    var k: Int = 0
    for(i in 1..a){
        if(a%i==0L){
            ++k
        }
    }
    print(k)
}


class values constructor(a:Int){
    var arr:Array<Long?> = arrayOfNulls(a)
    val num = a
    var q: Int = 0
    fun StoreValue(){
        for (i in 0 until num){
            var value = readLine()!!.split(" ".toRegex()).map(String::toLong)
            checkValue(value[0],value[1],value[2])
        }
    }
    private fun checkValue(z:Number,m:Number,n:Number) {
        var k: Long = 0
        for (i in 1..m.toLong()){
            for (j in i..n.toLong()){
                if (i*j == z){
                    ++k
                }
            }
        }
        arr.set(q,k)
        ++q
    }
    fun print(){
        for (i in arr){
            println(i)
        }
    }
}

