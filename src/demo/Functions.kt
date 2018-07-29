package demo

fun main(args: Array<String>){


    var mult5:(Int) -> Int = {a -> a*5}
    println(createMultiplier(6)(10))



}

fun multiply(n: Int,multiplier: (Int) -> (Int)): Int {
    return multiplier(n)
}


fun createMultiplier(n: Int): (Int) -> Int = {a -> a*n}




fun multiply5(n: Int): Int = n*5