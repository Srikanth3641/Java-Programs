//Write a java program to display pair elements equals to given sum?
class Three_Pair_sum
{
	public static void main(String[] args) 
	{
		int[] arr={5,3,4,7,8,1,2,6,9,4};
		int sum=10;
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				for (int k=j+1;k<arr.length ;k++ )
				{

				if (arr[i]+arr[j]+arr[k]==sum)
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
				}
			}
		}
	}
}
