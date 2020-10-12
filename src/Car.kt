/**
 * 자동차 클래스 입니다.
 * 뛰뛰빵빵 broooooooom
 */

open class Car{
    var color : String = ""
    var speed : Int = 0

    /**
     * 속도 올리는 메서드
     * @param value: 증가시킬 속도
     */

    companion object{ // 지역변수 사용 불가, 상수 선언부
        var carCount : Int = 0
        const val MAXSPEED : Int = 200 // 도로 최대 법속 속도 제한
        const val MINSPEED : Int = 0
        fun currentCarCount(): Int{
            return carCount
        }
    }
    constructor(speed:Int){

    }
    constructor(color:String){
        carCount++
        this.color = color
    }
    constructor(){
        carCount++
    }

    constructor(color:String, speed: Int){
        this.color = color // 없어도 됨
        this.speed = speed
    }

    open fun upSpeed(value : Int){
        speed = speed + value
        if(speed >= MAXSPEED){
            speed = 200
        }
    }

    fun downSpeed(value : Int){
        speed = speed - value
        if(speed < 0){
            speed = 0
        }
    }

    fun main(){
        var myCar1 : Car = Car("빨강", 0)
        myCar1.color = "빨강" // 없어도 됨
        myCar1.speed = 0

        var myCar2 : Car = Car("파랑", 0)
        myCar2.color = "파랑"
        myCar2.speed = 100

        var myCar3 : Car = Car("초록", 0)
        myCar3.color = "초록"
        myCar3.speed = 50

        myCar1.upSpeed(50)
        println("자동차1의 색상은 " + myCar1.color + "이며, 속도는" +
                myCar1.speed + "km/h 입니다.")

        myCar2.downSpeed(30)
        println("자동차2의 색상은 " + myCar2.color + "이며, 속도는" +
                myCar2.speed + "km/h 입니다.")

        myCar3.upSpeed(50)
        println("자동차3의 색상은 " + myCar3.color + "이며, 속도는" +
                myCar3.speed + "km/h 입니다.")

    }
}