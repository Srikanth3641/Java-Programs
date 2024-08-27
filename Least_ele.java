/*Q) Write a java program to find out least element from given array?

Input:
	7 2 4 9 1 6 3 

Output:
	1
*/
class Least_ele
{
	public static void main(String[] args) 
	{
		int[] arr={7,2,4,9,1,6,3};
		int small=arr[0];
		for(int i:arr)
		{
			if(i<small)
			{
				small=i;
			}
		}
		System.out.println(small+" ");
	}
}
