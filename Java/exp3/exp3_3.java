import java.util.*;
class ArraySum {
  public static void main(String[] args) {
    int T,n,at;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no of times u want to perform the operation:");
    at = sc.nextInt();
    System.out.println("Enter the no of elements u want:");
    n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    for(int k=0;k<at;k++)
    {
      System.out.println("Enter the elements of the array: ");
      for(int i = 0;i<n;i++)
      {
        a[i] = sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        T = 0;
        for(int j=0;j<n;j++)
        {
          if (i==j)
          {
            continue;
          }
          T += a[j];
        }
        b[i] = T;
      }      
      System.out.println("The expected output u wanted:");
      for(int i=0;i<n;i++)
      {
        System.out.println(b[i]);
      }
    }

  }
}
