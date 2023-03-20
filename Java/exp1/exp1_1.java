import java.util.*;
import java.io.*;
// java com.Main
class Exp1_1 {
  public static void main(String[] args)
  {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello World");
    int empno,cca=220,pt=100;
    float basic,da,hra,pf;
    String empname;
    System.out.print("Enter the Employee no: ");
    empno = sc.nextInt();
    System.out.print("Enter the Employee basic salary: ");
    basic = sc.nextFloat();
    System.out.println("Enter the Employees Name : ");
    empname = sc.nextLine();
    System.out.println(empno+" is the Empno"+basic+" is the Salary basic and "+empname+" is the Employee name");
    da = 0.70f*basic;
    hra = 0.30f*basic;
    pf = 0.10f*basic;
    System.out.println("Your DA is "+da+"and HRA is "+hra+"also the PF is "+pf);
  }
}
