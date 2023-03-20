// Write a program to find max of 3 Nos. 
object Main {
  def main(args: Array[String])={
    println("Hello World")
    val (a,b,c) = (2,5,9)
    println(a,b,c)
    val max1:Int = max(a,b,c)
    print("The maxx is :  "+max1)
  }

  def max(a:Int,b:Int,c:Int):Int={
    if (a<b){
      if(c>b){
        return c
      }else{
        return b
      }
    }else{
      if(a>c){
        return a
      }else{
        return c
      }
    }
  }
}