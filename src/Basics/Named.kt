package Basics

import java.lang.Enum.valueOf
import java.math.RoundingMode.valueOf
import java.util.Arrays.toString
import kotlin.reflect.jvm.internal.impl.incremental.components.Position

interface Dimensions {
    val length : Double
    val breadth : Double
}

interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}

interface Named{
    val name : String
}

interface FullName: Named{
    val firstName: String
    val lastName: String

    override val name: String
        get() = "$firstName $lastName"
}

data class Employee(
    override val firstName: String,
    override val lastName: String,
    val position: Position
):FullName

fun main(){
  /*  println("Enter your first name: ")
    val x = readLine()
    println("Enter your last name: ")
    val y = readLine()
    println("Enter your position: ")
    val z: Position = Position(1,1)
 val u =   Employee(firstName = x.toString(), lastName = y.toString(), position =z)
    println(u.toString())*/

    println("Is 8 even? - ${isEven.accept(8)}")
}
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}
val isEven = IntPredicate { it % 2 == 0 }

