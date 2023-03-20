import java.util.*;
import java.io.*;
class Main
{
	// array
	public static void main(String x[])
	{
		int n,temp;
		//Scanner sc = new Scanner(System.in);
		//n = sc.nextInt();
		int a[] = new int[]{5,9,6,8,7};
		for (int i = 0;i<5;i++)
		{
			//System.out.print("Unsorted : " +a[i]+"\t");
			for (int j=0;j<4-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];					
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}			
		}
		for (int i = 0;i<5;i++)
		{
			System.out.println("Sorted: "+a[i]+"\t");
			//System.out.print(a[i]);
		}
	}
}