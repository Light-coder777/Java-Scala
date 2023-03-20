class Area
{
	int a,b;
	void Area()
	{
		init();
		System.out.println("Area is - " + a);
	}
	void area(int a)
	{
		System.out.println("Area is - " + a*a);
	}
	void area(float a)
	{
		System.out.println("Area is - "+ a*a);
	}
	void area(int a,int b)
	{
		System.out.println("Area is - "+a*b);
	}
	void area(float a,float b)
	{
		System.out.println("area is - "+a*b);
	}
}

class Main 
{
	public static void main(String x[])
	{
		Area a = new Area();
		//a.area();
		//a.area(10);
		//a.area(15.6f);
		//a.area(5,5);
		//a.area(5.2f,4.8f);
	}
}