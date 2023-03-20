object MyClass {
 def main(args: Array[String]) {
  var i = 1;
  var j=0;
  for(i<-1 to 10){
  for(j<-1 to i){
    print("*");
  }
  println();
 }
 }
}