package demo

import org.jetbrains.annotations.Mutable

fun main(args: Array<String>){
    //println("Hello World!")
 //   var name: String = "abc"
//    name = "xyz"
//    val a = "xyz"
//    var number:Int = 10
//    var array : Array<Int>
//    number = 10.0
//    printName(a)

    //println("Factorial of 20 is ${factorial(20)}")
//
//    var array= arrayOf(1,2,3,4,"a",1.2,'x')
//    println("Size of array is ${array.size}")
//    for((i,a) in array.withIndex()){
//        println("Value at index $i is $a")
//    }
//    array.set(0,"a")
//    array[0] = "xyz"
//    var a = array[0]


    var range = 1..100
//    for(i in range.step(2)){ println(i)}

    var a = 10
    when {
        a < 5 -> println("a is greater than 5")
        a is Int -> println("a is int")
        a in range -> println("a is in range")
        a == 10 -> println("a is 10")
        else -> println("less than 5")
    }

    var map: HashMap<Int,String>



}

fun printName(name: String){
    print("Name: $name")
}

fun factorial(n: Long): Long = if(n == 1L) 1  else n * factorial(n-1)


