import letmecalculate.*;

public class calci {
  public static void main(String[] args) {
    Calculate c = new Calculate();
    int a = c.add(5,6);
    int s = c.sub(5,6);
    int m = c.mul(5,6);
    int d = c.div(5,6);
    System.out.println(a+s+m+d);
  }  
}
