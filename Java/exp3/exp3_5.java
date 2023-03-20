import java.util.*;
class Freq {
  public static void main(String[] args) {
    Vector<Integer> vect = new Vector<>();
    Scanner sc = new Scanner(System.in);
    int n,ele;
    System.out.println("Enter the no of elements: ");
    n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
      ele = sc.nextInt();
      vect.add(ele);
    }
    int count,flag=1;
    do
    {
      count = 0;
      System.out.println("Enter the elements whose freq. u want:");
      ele = sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if (ele == vect.get(i))
        {
          count += 1;
        }
      } 
      System.out.print("The Frequency u wanted: "+count);
      System.out.println("If u want to continue then press 1:");
      flag = sc.nextInt();
    }while(flag==1);
    sc.close();
  }
}
