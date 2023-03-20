class Student
{
  int roll_no;
  public Student(int r)
  {
    roll_no = r;
  }
}

class Test extends Student
{
  int sem1_marks,sem2_marks;
  public Test(int s1,int s2,int r)
  {
    super(r);
    sem1_marks = s1;
    sem2_marks = s2;
  }
}

interface Sports 
{
  void score();
}

class Result extends Test implements Sports
{
  int total,sc ;
  public Result(int s1,int s2,int r,int sc){
    super(s1,s2,r);
    this.sc =sc;
  }
  @Override 
  public void score()
  {
    System.out.println("Score = "+sc);
  }
  int total_marks()
  {
    int total = super.sem1_marks + super.sem2_marks + sc;
    return total;
  }
}

class School
{
  public static void main(String[] args) {
    Student s = new Student(14);
    Result res = new Result(15,25,14,5);
    System.out.println("Total marks are = "+res.total_marks());
    System.out.println(s.roll_no);
  }
}
