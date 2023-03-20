class Complex {
  double realPart,imaginaryPart;
  public Complex()
  {
    realPart = 0;
    imaginaryPart = 0;
  }
  public Complex(double rp,double ip)
  {
    realPart = rp;
    imaginaryPart = ip;
  }
  public void setRealPart(double rp)
  {
    this.realPart = rp;
  }
  public void setImaginaryPart(double ip)
  {
    this.imaginaryPart = ip;
  }
  public double getRealPart()
  {
    return realPart;
  }
  public double getImaginaryPart()
  {
    return imaginaryPart;
  }
}
class ComplexDemo
{
  public static void main(String[] args) {
    Complex c = new Complex();
    double x = c.getRealPart();
    double y = c.getImaginaryPart();
    System.out.println("The value of x is " + x + "  and that of y is " + y);
    Complex c2 = new Complex(5.0,6.0);
    x = c2.getRealPart();
    y = c2.getImaginaryPart();
    System.out.println("The value of x is "+x+" and that of y is "+y);
    c2.setImaginaryPart(22.0);
    c2.setRealPart(22.0);
    x = c2.getRealPart();
    y = c2.getImaginaryPart();
    System.out.println("The value of x is "+x+" and that of y is "+y);

  }
}