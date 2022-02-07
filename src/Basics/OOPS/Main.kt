package Basics.OOPS


import kotlin.collections.ArrayList

fun main(){

    val name:String = readLine().toString()
    val basicSalary:Double = readLine()!!.toDouble()
    val k = Manager(name,basicSalary)
    k.doubleGrossSal()
    println(arr[1])

}


data class db(val name: String,val ba:Double,val da:Double, val hra:Double, val it:Double)

internal var arr = ArrayList<db>()

abstract class Employee constructor(name:String, ba:Double ) {
    private val Name: String = name
    private val basic_sal: Double = ba
    protected val da: Double = basic_sal * 0.7
    protected val hra: Double = basic_sal * 0.3
    protected val it: Double = basic_sal * 0.4
    open fun doubleGrossSal(){}

   open fun addToDb(){
        var k = db(Name,basic_sal,da,hra,it)
        arr.add(k)
    }
}

class Manager(name:String,ba:Double):Employee(name,ba){

    init {
        super.addToDb()
    }
    override fun doubleGrossSal() {
        val doubleGrossSald:Double = super.da+ super.hra

        println(doubleGrossSald)
    }

}