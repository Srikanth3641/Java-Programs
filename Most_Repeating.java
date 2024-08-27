/*Q) Write a java program to display most repeating element from given array?

input:
	5 1 2 4 2 9 7 2 2 6 6 2 

output:
	2 is repeating for 5 times
*/
class Most_Repeating
{
	public static void main(String[] args) 
	{
		int[] arr1={5,1,2,4,2,9,7,2,2,6,6,2};
		int maxCount=0;
		int element=0;
		for(int i=0;i<arr1.length;i++)
		{
			int cnt=0;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					cnt++;

				}
			}
			if (cnt>maxCount)
			{
				maxCount=cnt;
				element=arr1[i];
			}
		}
		System.out.println(element+" is repeating "+maxCount);
	}
}
