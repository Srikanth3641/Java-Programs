/*Q) Write a java program to display unique elements from given array?

Input:
	3 6 1 2 3 9 4 4 7 6 10

Output:
	1 2 9 7 10
*/
class Unique_elements
{
	public static void main(String[] args) 
	{
		int[] arr={3,6,1,2,3,9,4,4,7,6,10};
		for (int i=0;i<arr.length ;i++ )
		{
			int cnt=0;

			for(int j=0;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					cnt++;
				}
			}
			if(cnt==1)
		
			{
			System.out.print(arr[i]+" ");
			}
		}
		
	}
}
