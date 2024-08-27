/*Q) Write a java program to display 10 fibonacci numbers?

output:
	0 1 1 2 3 5 8 13 21 34
*/
class fib_array
{
	public static void main(String[] args) 

	{
		int n=10;
		int[] fib=new int[n];
		fib[0]=0;
		fib[1]=1;
		System.out.print(fib[0]+" "+fib[1]);
		for(int i=2;i<fib.length;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			System.out.print(" "+fib[i]);
			
		}
		
	}
}
