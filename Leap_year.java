//java program leap year
import java.util.Scanner;
class Leap_year
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Leap year :");
		int year=sc.nextInt();
		if(year%4==0) //&& (year%100!=0) || year%400==0)
		{
			System.out.println("leap year");
		}
		else
			System.out.println("not leap year");

	}
}
