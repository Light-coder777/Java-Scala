// Java program for Vampire
import java.util.*;
import java.io.*;
class Vampire{
  public void Vamp(int a)
  {
    int temp,b=a,mul1,mul2;
    int[] arr = new int[4];
    int[] index = {0,1,2,3};
    int n,m,t = 0,done = 0;

    for(int i=0;i<4;i++)
    {
      temp = a%10;
      arr[i] = temp;
      a = a/10;
    }

    for(int i=0;i<4;i++)
    {
      // System.out.println(arr[i]);
    }

    for(int i=0;i<4;i++)
    {
      // if(arr[i]==0)
      // {
      //   continue;
      // }
      for(int j=0;j<4;j++)
      {
        n = m =-1;
        if (i==j)
        {
          continue;
        }
        System.out.print(Integer.toString(arr[i])+arr[j]);
        // System.out.print(Integer.toString(i)+j);
        
        for(int k=0;k<4;k++)
        {
          if ((index[k] == i) || (index[k] == j))
          {
            continue;
          }
          if(n==-1)
          {
            n = arr[k];
            continue;
          }
          if(m==-1)
          {
            m = arr[k];
          }
        }
        
        System.out.println(" "+Integer.toString(n)+m);
        // System.out.print(" "+Integer.toString(n)+m);
        mul1 = ((arr[i]*10)+arr[j]) * ((n*10)+m);
        mul2 = ((arr[i]*10)+arr[j]) * (m+n*10);
        if ((b == mul1) || (b==mul2))
        {
          System.out.println("Your 4 digits no is a vampire no ");
          return;
        }
      }
    }
    System.out.println("Your 4 digits no is not a vampire no");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no for Vampire:");
    int a = sc.nextInt();
    Vampire v = new Vampire();
    v.Vamp(a);
  }
}