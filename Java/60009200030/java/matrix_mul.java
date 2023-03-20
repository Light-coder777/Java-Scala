import java.util.*;
import java.io.*;
class Main
{
	public static void main(String x[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[3];
		for(int j=0;j<5;j++)
		{
				n = sc.nextInt();
				a[j] = n;
		}
		System.arraycopy(a,0,b,0,3);
		for(int i=0;i<3;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}
}