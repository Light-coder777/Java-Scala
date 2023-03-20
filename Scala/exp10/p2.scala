object Main {
    def sumS():Int={
        var sum = 0;
        for(i <- 1 to 10){
            sum = sum + i*i
        }
        return sum;
    }
    def main(args: Array[String]) {
        println("the sum of sqaures from 1 to 10 is " + sumS());
    }
}

