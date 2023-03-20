class Student {
  String student;
  public Student()
  {
    this.student = "Unknown";
  }
  public Student(String sd)
  {
    this.student = sd;
  }
  public void display()
  {
    System.out.println(this.student);
  }
  public static void main(String[] args) {
    Student st = new Student();
    st.display();
    Student s = new Student("Sarvagya");
    s.display();
  }
}
