/*Q) Write a java program to find out highest element from given array?

Input:
	7 2 4 9 1 6 3 

Output:
	9
*/

class Highest_ele 
{
	public static void main(String[] args) 
	{
		int[] arr={7,2,4,9,1,6,3};
		int big=arr[0];
		for(int i:arr)
		{
			if(i>big)
			{
				big=i;
			}
		}
		System.out.println(big+" ");

	}
}
