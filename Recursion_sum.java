//Write a java program to perform sum of two numbers without using arithmetic operator?

class Recursion_sum  
{
	public static void main(String[] args) 
	{
		//caller
		System.out.println(sum(5,6));

	}
	//static method
	//callie
	public static int sum (int a, int b)
	{
		if(a==0)
			return b;
		return sum (--a,++b);
	}

}
