package demo

fun main(args: Array<String>){
    var mult5:(Int) -> Int = {it*5}
    println(multiply(6,createMultiplier(10)))
    println(createMultiplier(6)(10))
}

fun multiply(n: Int,multiplier: (Int) -> (Int)): Int {
    return multiplier(n)
}

fun createMultiplier(n: Int): (Int) -> Int = {it*n}

fun multiply5(n: Int): Int = n*5