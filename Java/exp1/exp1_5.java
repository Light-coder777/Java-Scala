import java.util.*;
import java.io.*;
class exp1_5 {
  public static void main(String args[])
  {
    int i,n,temp,min=999999,max=0;
    Scanner sc = new Scanner(System.in);
    int[] a = {1,4,17,7,25,3,100};
    // System.out.println("Enter the no of elements in the array: ");
    // n = sc.nextInt();
    // for(int j=0;j<n;j++)
    // {
    //   System.out.print("Enter the "+j+"th element of the array: ");
    //   a[j] = sc.nextInt();
    // }
    for(int j=0;j<a.length;j++)
    {
      System.out.print("Enter the "+j+"th element of the array: "+a[j]);
      System.out.println();
      // a[j] = sc.nextInt();
    }
    for(i=0;i<a.length;i++)
    {
      if(a[i]<min)
      {
        min = a[i];
      }
      if(a[i]>max)
      {
        max = a[i];
      }
    }
    System.out.println("The Minimum in the array list is : "+min);
    System.out.println("The Maximum in the array list is : "+max);
  }
}
