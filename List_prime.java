//Write a java program to display list of prime numbers from 1 to 100
import java.util.Scanner;
class List_prime
{
	public static void main(String[] args) 
	{
		for (int n=1;n<=100;n++ )
		{
			boolean flag=true;
			for (int i=2;i<=n/2 ;i++ )
			{
				if (n%2==0)
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				System.out.println(n+" ");
			}
			
		}
	}
}
