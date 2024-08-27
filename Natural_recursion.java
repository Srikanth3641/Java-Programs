// Write a java program to display 10 natural numbers without using loops?


class Natural_recursion
{
	public static void main(String[] args) 
	{
		natural(1);
	}
	public static void natural(int i)
		{
		if(i<=10)
			{
			System.out.print(i+" ");
			natural(i+1);
			}
		}
}
