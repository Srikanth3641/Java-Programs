//Write a java program to perform sum of 10 natural numbers?
class Sum_Natural
{
	public static void main(String[] args) 
	{
		int i=1,sum=0;
		do
		{
			sum=sum+i;
			i++;
		}
		while (i<=10);
		System.out.println("Sum of natural numbers "+sum);
	}
}
