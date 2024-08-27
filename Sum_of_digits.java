//Write a java program to display sum of digits of a given number?

import java.util.Scanner;
class Sum_of_digits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,rem;
		while (n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}
