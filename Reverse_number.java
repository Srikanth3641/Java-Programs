//Write a java program to display reverse of a given number?

import java.util.Scanner;
class Reverse_number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,rem;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;

		}
		System.out.println(rev);
	}
}
