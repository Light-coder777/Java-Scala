// abstract class Calculate {
//   abstract void Circle(float r);
//   abstract void rectangle(int l,int b);
//   abstract void triangle(float l,float b);  
// }

// class Calcarea extends Calculate{
//   void circle(float r){
//     System.out.println("Area of the Circle" + (22/7*r*r));
//   }
//   void rectangle(int l,int b){
//     System.out.println("Area of the Reactangle is " + (l*b));
//   }
//   void triangle(float l,float b)
//   {
//     System.out.println("Area of the Triangle is " + (l*b)/2);
//   }

// }

// class Area{
//   public static void main(String[] args) {
//     calc_area ca = new calc_area();
//     ca.circle(5);
//     ca.rectangle(4,5);
//     ca.triangle(4,9);
//   }
// }

abstract class Calculate {
  abstract void circle(float r);

  abstract void rectangle(int l, int b);

  abstract void trinagle(float l, float b);
}

class calc_area extends Calculate {
  void circle(float r) {
    System.out.println("Area of circle is " + (22 * r * r / 7));
  }

  void rectangle(int l, int b) {
    System.out.println("Area of rectangle is " + (l * b));
  }

  void trinagle(float l, float b) {
    System.out.println("Area of triangle is " + (l * b / 2));
  }
}

class Area {
  public static void main(String[] args) {
    calc_area c = new calc_area();
    c.circle(3);
    c.rectangle(2, 4);
    c.trinagle(5, 2);
  }
}