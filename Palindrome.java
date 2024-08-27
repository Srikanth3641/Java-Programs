//Write a java program to check given number is palindrome or not?
import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,rev=0,rem;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (temp==rev)
		{
			System.out.println("its a palindrome :");
		}
		else
			System.out.println("not a palindrome");
	}
}
