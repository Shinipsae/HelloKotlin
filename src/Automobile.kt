import Car as Car1

class Automobile : Car1 {
    constructor(){}

    override fun upSpeed(value:Int){
        speed = speed + value
        if(speed > 2000)
            speed = 2000
    }
}