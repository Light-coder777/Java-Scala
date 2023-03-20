import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int i,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Your factorial is ");
		i = sc.nextInt();
		temp = factorial(i);
		System.out.println(temp);
	}
	static int factorial(int i)
	{
	    if(i == 0)
	    {
	        return 1;
	    }else 
	    {
	        return i*factorial(i-1);
	    }
	}
}
