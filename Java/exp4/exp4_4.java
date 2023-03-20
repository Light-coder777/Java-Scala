class Person {
  String name;

  Person(String name) {
    this.name = name;
  }
}

class Employee extends Person {
  double salary;
  int year;
  String ins_no;

  Employee(String name, double salary, int year, String ins_no) {
    super(name);
    this.salary = salary;
    this.year = year;
    this.ins_no = ins_no;
  }

  boolean is_same(String n) {
    if (n == name) {
      return true;
    }
    return false;
  }
}

class Main {
  public static void main(String[] args) {
    Employee E = new Employee("Sarvagya", 25000, 2022, "1234");
    System.out.println(E.is_same("Sarvayga"));
  }
}
