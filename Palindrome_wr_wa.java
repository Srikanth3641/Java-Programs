//with returntype with argument method 

import java.util.Scanner;
class Palindrome_wr_wa
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		//caller method
		System.out.println(palindrome(n));
	}
	public static String palindrome(int n)
	{
		//callie method
		int rev=0,rem;
		int temp=n;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (rev==temp)
		{
			return "palindrome";
		}
		else
			return "not palindrome";
	}
}


	