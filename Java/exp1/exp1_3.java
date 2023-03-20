import java.util.*;
import java.io.*;
// import java.Math;
class Main
{
	public static void main(String[] args) {
	    int i,temp;
		Scanner sc = new Scanner(System.in);
		// System.out.print("Your factorial is ");
		// i = sc.nextInt();
		// temp = factorial(i);
// 		System.out.println(temp);
//         System.out.print("Enter the armstrong no:");
//         i = sc.nextInt();
//         armstrong(i);
        // System.out.print("Enter the Palindrome no:");
        // i = sc.nextInt();
        // testPalindrome(i);
        System.out.print("Enter the no for prime:");
        i = sc.nextInt();
        String txt = testPrime(i);
        System.out.print(txt);
        
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
	static void armstrong(int i)
	{
	    int arm=0,temp,t;
	    t = i;
	    while(i!=0)
	    {
	      temp = i%10;
	      i = i/10;
	      arm += Math.pow(temp,3);
	    }
	    if(t==arm)
	    {
	        System.out.println("Your no " + arm + "is Armstrong ");
	    }else 
	    {
	        System.out.println("Your no "+arm+"is not a Armstrong");
	    }
	}
	static void testPalindrome(int i)
	{
	    int pal=0,temp,t;
	    t = i;
	    int index = 0;
	    while(i!=0)
	    {
	      index += 1;
	      temp = i%10;
	      i = i/10;
	      pal += temp*Math.pow(10,index);
	    }
	    if(t==pal)
	    {
	        System.out.println("Your no " + pal + "is a Palindrome ");
	    }else 
	    {
	        System.out.println("Your no "+ pal +"is not a Palindrome");
	    }
	}
	static String testPrime(int i)
	{
	    int count=1;
	    if (i<0)
	    {
	        return "Not a possible solution";
	    }
	    while(count<(i/2)+1)
	    {
	        count += 1;
	        if(i%count==0)
	        {
	           return "Not a prime no";
	          //  return Integer.toString(count);
	        }    
	    }
	    return "A prime no";
	}
}
