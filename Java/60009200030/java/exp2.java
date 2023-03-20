// Constructor making
class Circle
{
	float a,r;
	//Default Constructor with no arguments
	Circle()
	{
		r = 0;
	}
	Circle(Circle c)
	{
		r = c.r;
	}
	Circle(float x)
	{
		//Area of a square
		a = x*x;
		System.out.println("Area of a Circle :"+a);
		
	}
	//Default Constructor with one arguments
	Circle (int x)
	{
		r = x;
	}
	void process()
	{
		a = 3.14f*r*r;
	}
	void output()
	{
		System.out.println("Area of a Circle :"+a);
	}
}
class Main
{
	public static void main(String x[])
	{
		Circle c = new Circle(15);
		c.process();
		c.output();
		
		Circle c1 = new Circle(c);
		c.process();
		c.output();
	}
}