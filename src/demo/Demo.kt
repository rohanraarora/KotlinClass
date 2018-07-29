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


//    var range = 1..100
////    for(i in range.step(2)){ println(i)}
//
//    var a = 10
//    when {
//        a < 5 -> println("a is greater than 5")
//        a is Int -> println("a is int")
//        a in range -> println("a is in range")
//        a == 10 -> println("a is 10")
//        else -> println("less than 5")
//    }
//
//    var map: HashMap<Int,String>

//    var user: User = User(name = "abc")
//    user.age = 10
    //user.print()



//    var student = Student("abc",1,10)
    //student.print()


//    student = user as Student
//
//
//    user = student
//    user.rollNo
//    user.print()
//
//    if(user is Student){
//        user.rollNo
//    }

//
//    var b = 10 add 3
//
//    var kMovie: KMovie = KMovie("abc",10)
//    var jMovie: JMovie = JMovie("xyz",4)
//
//    var teacher = Teacher.getInstance()
//
//    var a = 10.multiplyFive()
//    println("A: $a")


    var user: User? = User("abc",10)
//    if(user != null){
//        user.email = "ABC@gmail.com"
//        println(user.email)
//    }

    var name:String = user!!.email



    user = null




}

interface A {
    val a:Int
    fun abc()
}

fun printName(name: String){
    print("Name: $name")
}

fun factorial(n: Long): Long = if(n == 1L) 1  else n * factorial(n-1)

open class User(val name: String,var age: Int ) {

    var email: String = ""
    set(value){
        field = value.toLowerCase()
    }
    get(){
        return field.toUpperCase()
    }

    constructor(name: String): this(name,0)

    init{
        println("User is initializing")
    }

    open fun print(){
        println("Name: $name")
        println("Age: $age")
    }

}

class Student( name: String, age: Int,var rollNo: Int): User(name,age),A {
    override val a: Int = 10


    override fun abc() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun print(){
        super.print()
        print("Roll No: $rollNo")
    }

}

class Teacher {

    companion object {
        fun getInstance(): Teacher{
            return Teacher()
        }
    }


}

fun Int.multiplyFive(): Int = this*5

fun Student.printRollNo(){

}

infix fun Int.add(a: Int): Int {
    return this + a
}






