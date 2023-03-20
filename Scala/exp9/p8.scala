def mult(args: Int*) = {  
    var mul = 1;  
    for(a <- args) mul*=a  
    mul
}  
var mul = mult(2,2,7,2,3,4,5,6,10,5);  
println(mul); 
