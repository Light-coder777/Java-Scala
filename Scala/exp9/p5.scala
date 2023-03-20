object MyClass {
    def add(x:Int, y:Int):Int={
        var sum = 0
        if (x == y){
            sum = (x+y)*3
        }
        else{
            sum = x+y
        }
        return sum
    }

    def main(args: Array[String]) {
        print("sum of x + y = " + add(10,10));
    }
}
