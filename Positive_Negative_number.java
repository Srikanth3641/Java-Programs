//Write a java program to find out given number is positive or negative by using nested if stmt?
import java.util.Scanner;
class Positive_Negative_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println("the number is positive");
				System.exit(0);
			}
			System.out.println("Negative number");
		}
		System.out.println("You entered zero");
	}
}
