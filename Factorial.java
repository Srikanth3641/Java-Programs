//Write a java program to find out factorial of a given number?
import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fact=1;
		do
		{
			fact=fact*n;
			n--;
		}
		while (n>=1);
		System.out.println(fact);
	}
}
