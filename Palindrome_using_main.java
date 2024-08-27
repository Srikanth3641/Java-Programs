import java.util.Scanner;
class Palindrome_using_main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,rem;
		int temp=n;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (temp==rev)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
