object MyClass {
  def test(n: Int): Boolean =
    {
    n % 3 == 0 || n % 7 == 0;
    }
     
   def main(args: Array[String]): Unit = {
      println("Result 30: " + test(30));
      println("Result 14: " + test(19));
      println("Result 19: " + test(21));
      println("Result 35: " + test(10));
    }
}
