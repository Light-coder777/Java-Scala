class Vehicle{  
     val speed:Int = 60  
}  
class Bike extends Vehicle{  
   override var speed:Int = 100  
    def show(){  
        println(speed)  
    }  
}  
object MainObject{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()  
    }  
} 