import java.util.*;
import java.io.*;
public class exp1_4 {
 public static void main(String ars[])
 {
  int i,temp;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the no whose multiple u want: ");
  i = sc.nextInt();
  for(int j=1;j<=10;j++)
  {
    System.out.println("Multiple of "+j+"is:"+j*i);
  }
 }
}
