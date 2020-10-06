import kotlin.ArithmeticException

fun main(){
    var num1 = 100
    var num2 = 0
    try{
        println(num1 / num2)
    } catch(e : ArithmeticException){
        println("계산에 문제가 있습니다.")
    } catch(e: Exception){

    }
}
