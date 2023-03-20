import java.util.*;
class Vect
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y;
		Vector v = new Vector(7,3);
		for (int i=0;i<7;i++)
		{
			y = sc.nextInt();
//			System.out.println()
			v.addElement(new Integer(y));
		}
		
//		for (int j =0;j<7;++)
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.elementAt(2));
		System.out.println(v.lastElement());
		System.out.println(v.firstElement());
		System.out.println(v.lastIndexOf(6));
		System.out.println(v.removeElement(6));
//		System.out.println(v.removeElementAt(3));
	}
}