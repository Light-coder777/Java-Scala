abstract class Animals 
{
  def cats() 
  def dogs()
} 

class Cats extends Animals 
{
  def cats() 
  {
    println("Cats meow...")
  } 
  def dogs()
  {
    
  }
}

class Dogs extends Animals 
{
  def cats() 
  {
    
  }
  def dogs() 
  {
    println("Dogs bark...")
  }
}

object Main 
{
  def main(args:Array[String]):Unit={
    var c = new Cats() 
    var d = new Dogs() 
    c.cats() 
    d.dogs()
  }
}