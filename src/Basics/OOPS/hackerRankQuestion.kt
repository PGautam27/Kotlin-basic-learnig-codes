package Basics.OOPS
import java.io.*
import java.util.*

fun main(args: Array<String>) {
    var T: Int = Integer.valueOf(readLine())
    for(i in 0 until T){
        var s = readLine()!!.split(" ".toRegex())
        makePhone(s[0].toString(),s[1].toInt())
    }
    do{
        var d = readLine()
        Arr.add(d.toString())
    }while(d!=null)
    for(i in 0 until Arr.size-1){
        if(hashMap.containsKey(arr[i].toString())){
            println("${Arr[i]}=${hashMap[Arr[i]]}")
        }
        else{
            println("Not found")
        }
    }
}
var Arr:ArrayList<String> = ArrayList<String>()
var hashMap : HashMap<String, Int> = HashMap<String, Int> ()
fun makePhone(name:String, phNo:Int){
    hashMap.put(name, phNo)
}

