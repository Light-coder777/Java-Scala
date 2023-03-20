class Student {
  String name;
  int roll_no;
  public Student(String n,int roll)
  {
    this.name = n;
    this.roll_no = roll;
  }
  public void display()
  {
    System.out.println("The Students name is "+this.name+" and theirs roll no is "+ this.roll_no);
  }
  public static void main(String[] args) {
    Student s = new Student("Sarvagya",30);
    s.display();
  }
}
