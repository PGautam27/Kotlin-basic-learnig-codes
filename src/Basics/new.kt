package Basics

fun main() {
    val i: Int = Integer.valueOf(readLine())
    val j = readLine()
    println(i*2)
    println(j)
    val x = readLine()
    palindrome(x.toString())
    factorial(i)
    lowerToUpperViceVersa(x.toString())
}

fun palindrome(a:String){
    val k = a
    val j = k.reversed()
    if(k==j){
        print("Successful")
    }
    else{
        println("Unsuccessful")
    }
}

fun factorial(a:Int){
    var i:Int = 1
    var k:Int = 1
    while(i<=a){
        k *= i
        ++i
    }
    println(k)
}

fun lowerToUpperViceVersa(a:String){
    var j:String =""
    for( i in a ){
        if(i.isLowerCase()){
            j+=i.uppercaseChar()
        }
        else{
            j+=i.lowercaseChar()
        }
    }
    print(j)
}