/*Q) Write a java program to display duplicate elements from given array?

Input:
	3 6 1 2 3 9 4 4 7 6 10

Output:
	3 6 4 
*/
class Dis_Duplicate
{
	public static void main(String[] args) 
	{
		int[] arr={3,6,12,3,9,4,4,7,6,10};
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
