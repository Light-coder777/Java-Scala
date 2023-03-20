import scala.util.control.Breaks._
object MyClass {
 def prime(x:Int){
 var flag = 0
 var i = 2
 do{
 if (x%i == 0){
 flag = 1
 print("Not a prime number.")
 break
 }
 i = i+1
 }while(i <= x/2)
 if (flag == 0){
 print("Is a prime number.")
 }
}
 def main(args: Array[String]) {
 prime(12);
 }
}
