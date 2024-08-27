//Q) Write a java program to display N-th element of a fibonacci series?

class Nth_fibonacci
{
	public static void main(String[] args) 
	{
		System.out.println(fib(4));
	}
	public static int fib(int n)
	{
		if((n==1) || (n==0))
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
