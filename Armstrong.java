//Write a java program to check given number is armstrong or not?
import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,sum=0;
		int temp=n;
		while (n!=0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println("amstrong");

		}
		else
		{
		System.out.println("no");
		}

	}
}
