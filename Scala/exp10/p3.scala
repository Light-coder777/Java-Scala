abstract class Bank{
 def getBalance()
}
 
class A extends Bank{
 def getBalance(){
  println("Balance: $ 100")

 }
}

class B extends Bank{
 def getBalance(){
   println("Balance: $ 150")

 }
}
class C extends Bank{
 def getBalance(){
   println("Balance: $ 200")

 }
}
 
object MainObject{
 def main(args: Array[String]){
 var a = new A()
  var b = new B()
 var c = new C()

 a.getBalance()
  b.getBalance()
 c.getBalance()

 }
}
