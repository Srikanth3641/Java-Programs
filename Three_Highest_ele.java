/*Q) Write a java program to display three highest elements from given array?

Input:
	7 2 4 9 1 6 3 

Output:
	9 7 6 
*/
class Three_Highest_ele
{
	public static void main(String[] args) 
	{
		int[] arr={7,2,4,9,1,6,3};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>first)
			{
				third=second;
				second=first;
				first=i;
			}
			else if(i>second)
			{
				third=second;
				second=i;
			}
			else if(i>third)
			{
				third=i;
			}
		}
		System.out.println(first+" "+second+" "+third);
	}
}
