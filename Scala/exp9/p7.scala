object MyClass {
    def fact(x:Int):Int={
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x * fact(x-1);
        }
    }
    
    def power(x:Int,y:Int):Int={
        var pro = x;
        var i = y;
        while(i!=0){
            pro *= pro;
            i-=1;
        }
        return pro;
    }

    
    def series_sum(a:Int,x:Int,fact:Int=>Int,power:(Int,Int)=>Int):Double={
        var exp = 0.0;
        for(i <- 1 to a){
            exp = exp + power(x,i)/fact(i);
        }
        return exp
    }

    def main(args: Array[String]) {
        val a = scala.io.StdIn.readInt();
        val x = scala.io.StdIn.readInt();
        print("The sum of the series is : ");
        print(series_sum(a,x,fact,power))
    }
}
