var myVar = 100

fun main(){
    var myVar = 0
    println(myVar)
    var sum = addFunction(10, 20)
    println(sum)
}

fun addFunction(num1: Int, num2: Int): Int {
    return num1 + num2 + myVar
}
