import java.util.*;
import java.io.*;
class Main
{
	// array
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int a[][] = new int[n][];
		for (int i=0;i<n;i++)
		{
		   a[i] = new int[i+1];	
		}
		for (int i = 0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				a[i][j] = count++;
			}			
		}
		for (int i = 0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}