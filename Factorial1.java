//Write a java program to find out factorial of a given number?
//while loop
import java.util.Scanner;
class Factorial1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		while (n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
