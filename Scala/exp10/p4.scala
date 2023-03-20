abstract class Animals {
    def cats()
    def dogs()
}

class Cats extends Animals {
    def cats(){
        println("Cats meow")
    }
    def dogs(){
        
    }
}

class Dogs extends Animals {
    def dogs(){
        println("Dogs bark")
    }
    def cats(){
        
    }
}

object MyClass {

    def main(args: Array[String]) {
        var c = new Cats()
        var d = new Dogs()
        c.cats()
        d.dogs()
    }
}
