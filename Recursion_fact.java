//Write a java program to display factorial of a given number using recursion?


class Recursion_fact 
{
	public static void main(String[] args) 
	{
		System.out.print(factorial(5));
	}
	public static int factorial(int n)
	{
		if(n<0)
			return -1;
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
}
