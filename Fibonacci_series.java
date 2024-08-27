//Write a java program to display fibonacci series of a given number ?
import java.util.Scanner;
class Fibonacci_series 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0, b=1,c;
		System.out.print(a+" "+b+" ");
		for (int i=2;i<=n ;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
