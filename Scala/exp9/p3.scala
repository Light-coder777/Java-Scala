object MyClass {
    var sum = 0
    def add(a:List[Int]){
        for (i <- a){
            sum += i*i
        }
        print(sum)
    }

    def main(args: Array[String]) {
        var nums: List[Int] = List(1, 2, 3, 4)
        add(nums)
    }
}
