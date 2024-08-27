//Write a java program to display pair elements equals to given sum?
class Pair_sum
{
	public static void main(String[] args) 
	{
		int[] arr={5,3,4,7,8,1,2,6,9,4};
		int sum=10;
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
