package Basics

open class Shape
class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

abstract class MyAbstractClass{
    abstract fun doSomethingBob()
    abstract fun asleep()
}

class OutClass<out T>(val value: T) {
    fun get(): T {
        println(value)
        return value
    }
}
val out = OutClass("string")
val ref: OutClass<Any> = out
class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

val myTurtle = Turtle()



fun main() {
//sampleStart
    val yt = OutClass("HI how are you")
    yt.get()
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
//sampleEnd
    val obj = object : MyAbstractClass(){
        override fun doSomethingBob() {
            println("Hi bob do something")
        }

        override fun asleep() {
            print("hi how are you aren't you sleepy")
        }
    }
    val x = {
            x: Comparable<Number>,
            y: Iterable<Number>, // trailing comma
        ->
        println("1")
    }
    x

    obj.doSomethingBob()
    with(myTurtle) { //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}