class Circle {
 var radius = 0.0
 var area = 0.0
 var pi = 3.14
 def accept_radius(r:Float){
 radius = r
 }
 def calculateArea(){
 area = (pi*radius*radius)
 }
 def display(){
 print(s"Radius: $radius and Area: $area")
 }
}
object MyClass {
 def main(args: Array[String]) {
 var a = new Circle()
 a.accept_radius(5)
 a.calculateArea()
 a.display()
 }
}