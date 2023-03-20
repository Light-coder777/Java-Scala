// Class name will have 1st letter Capital
import java.lang.*;
import java.util.Scanner;
class Naya
{
	public static void main(String x[])
	{
		float no1,no2,result = 0;
		int no;
		Scanner s = new Scanner(System.in);
		Maths c = new Maths();		
		System.out.println("Enter the no 2 below: ");
		// no = s.nextInt();
		no1 = s.nextFloat();
		no2 = s.nextFloat();
		// c.gcd(no1,no2);
		c.lcm(no1,no2);
		// c.prime(no1);
		// c.fibonacci();
		// c.pattern(no);
	}	
}

class Maths
{
	float a, r,result=0;
	float gcd(float no1,float no2)
	{
		float temp;
		temp = bigger(no1,no2);
		for (int i = 1;i<=temp;i++)
		{
			if (no1%i==0 && no2%i==0)
			{
				result = i;
			}
		}
		System.out.println("The GCD is " + result);
		return result;
	}

	void lcm(float no1,float no2)
	{
		float result,gcd;
		gcd = gcd(no1,no2);
		result = (no1*no2)/gcd;
		System.out.println("The LCM is " + result);
	}
	
	float bigger(float no1,float no2)
	{
		float temp;
		if (no1 < no2)
		{
			temp = no2;
		} else 
		{
			temp = no1;
		}
		return temp;
	}
	
	void prime(float no1)
	{
		for (int i = 2;i<no1;i++)
		{
			if (no1%i==0)
			{
				System.out.println(no1 + " is not a prime number");		
				return;
			}
		}	 
		System.out.println(no1 + " is  a prime number");
	}

	void fibonacci()
	{
		int a= 0,b =1,c,n;
		c = a + b;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Your Fibonacci series is ");
		for (int i=0;i<n;i++)
		{
			System.out.print(a + "\t");
			a = b;
			b = c;
			c = a + b;
		}
	}

	void pattern(int n)
	{
		for (int i = 0;i<=n;i++)
		{
			for (int j=n-i;j>0;j--){
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


// next , nextInt ,nextLine , nextDouble, nextFloat , nextLong