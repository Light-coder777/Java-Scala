import java.lang.*;
import java.io.*;
class Buffer
{
	public static void main(String x[])  throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a,b,c;
		System.out.println("Enter two nos:");
		a = Integer.parseInt(br.readLine());
		//b = Integer.parseInt(br.readLine());
		//c = a+b;
		//b = Nava();
		 b = Nava.Fact(a);
		//b = Fact(a);
		System.out.println("Factorial: "+b);
	}
	
}

class Nava
{
	static int Fact(int n)
	{
		if (n==1)
			return 1;
		else
			return n*Fact(n-1);
	}
}