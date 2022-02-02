package Basics


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

fun noOfWays(T:Int,a:Int,b:Int,c:Int){
    for(i in 1..T){

    }
}
enum class DAYS(val isWeekend: Boolean = false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    // Default value overridden
    SATURDAY(true);

    companion object{
        fun today(obj: DAYS): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }
}

class C {
    private fun getObject() = object {
        val x: String = "x"
    }

    fun printX() {
        println(getObject().x)
    }
}
fun main() {
    /* val i: Int = Integer.valueOf(readLine())
     val j = readLine()
     println(i*2)
     println(j)
     val x = readLine()
     palindrome(x.toString())
     factorial(i)
     lowerToUpperViceVersa(x.toString())*/
    for(day in DAYS.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }
    val today = DAYS.MONDAY;
    println("Is today a weekend ${DAYS.today(today)}")
    println()
    val obj = C()
    obj.printX()
    InitOrderDemo("Hello")
    Constructors(1)
}
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}
class Constructors {
    init {
        println("Init block")
    }
    constructor(i: Int) {
        println("Constructor $i")
    }
}
class Person(val pets: MutableList<Pet> = mutableListOf())
class Pet {
    constructor(owner: Person) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}
class MyClass {
    companion object { } // will be called "Companion"
}
fun MyClass.Companion.printCompanion() { println("companion") }
