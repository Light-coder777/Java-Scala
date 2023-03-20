object MyClass {
def max(x:Int, y:Int, z:Int)=if(x > y && x > z) x else if(y > x && y > z) y else z
def patternMatch(x:String){
for(i<- x){
i match{
case '1' => println("One")
case '2' => println("Two")
case '3' => println("Three")
case '4' => println("Four")
case '5' => println("Five")
case '6' => println("Six")
case '7' => println("Seven")
case '8' => println("Eight")
case '9' => println("Nine")
case '0' => println("Zero")
case _ => println("Default")
}
}
}
def main(args: Array[String]) {
patternMatch("12399");
}
}
