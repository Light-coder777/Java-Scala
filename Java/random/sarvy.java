// Class name will have 1st letter Capital
import java.lang.*;
import java.util.Scanner;
class Sarvy
{
	public static void main(String x[])
	{
		Circle c = new Circle();
		c.input();
		c.process();
		c.output();		
	}	
}

class Circle
{
	float a, r;
	Scanner s = new Scanner(System.in);
	void process()
	{
		a = (float)3.14 * r * r;
//		a = 3.14f * r * r;
	}
	void output()
	{
		System.out.println("Area is " + a);
	}
	void input()
	{
		System.out.println("Enter the no below: ");
		r = s.nextFloat();
	}
}


// next , nextInt ,nextLine , nextDouble, nextFloat , nextLong