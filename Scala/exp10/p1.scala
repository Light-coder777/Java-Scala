import java.util.Scanner
object Main {
  def test(n:Int) 
  {
    if(n%3==0) 
    {
      println("The given number is multiple of 3")
    }
    if(n%7==0) 
    {
      println("The given number is multiple of 7")
    }
  }
  def main(args: Array[String]): Unit = {
    // println("Hello world!") 
    var s = new Scanner(System.in)
    var n:Int = 0 
    println("Enter number: ") 
    n = s.nextInt() 
    test(n)
  }
}
