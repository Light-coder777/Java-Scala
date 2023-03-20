object Main{
  def main(args:Array [String]):Unit={
    println("Hello scala")
    var add = (x:Int,y:Int,z:Int)=>{x+y+z}
    val f = sum(_:Int,_:Int,0)
    print(add(20,20,20));
    println(f(30,35))
  }
}