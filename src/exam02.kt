fun main(){
    var one : IntArray = intArrayOf(10, 20, 30, 40)
    for(i in one.indices){
        println(i.toString() + " " + one[i])
    }
    for (i in one){
        println(i)
    }

    var two: Array<String> = arrayOf("하나", "둘", "셋", "넷")
    for(i in 0..3 step 1){
        println(two[i])
    }

    var k : Int = 0
    while (k < two.size) {
        println(two[k])
        k++
    }
}