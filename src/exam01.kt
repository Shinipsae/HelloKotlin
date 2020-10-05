fun main(){
    var var1 : Int = 10
    var var2 : Float = 10.1f
    var var3 : Double = 10.2
    var var4 : Char = '안'
    var var5 : String = "안드로이드"
    val pi : Double = 3.141592
    var1 = 5
    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)
    
    val jumsu : Int = 85
    when(jumsu){
        in 90 .. 100 -> println("합격장원")
        in 60 .. 89 -> println("합격")
        else -> println("불합격")
    }
    
}