//Write a java program to check given number is prime or not?
import java.util.Scanner;
class Prime_or_not
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		for (int i=2;i<=n/2;i++)
		{
			if (n%2==0)
			{
				flag=false;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println("it is a prime number");
		}
		else
			System.out.println("not prime");
		
	}
}
