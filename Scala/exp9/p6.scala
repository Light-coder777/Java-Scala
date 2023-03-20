object MyClass {
    def fibonacci(n:Int):Int={
        if (n == 1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    def main(args: Array[String]) {
        println(fibonacci(5))
    }
}
