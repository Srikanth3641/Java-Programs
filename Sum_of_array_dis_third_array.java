/*Q) Write a java program to perform sum of two array elements and display them in third array?

input:
	1 6 2 9 4
	8 2 4 1 3
output:
	9 8 6 10 7 
*/
class Sum_of_array_dis_third_array
{
	public static void main(String[] args) 
	{
		int[] arr1={1,6,2,9,4};
		int[] arr2={8,2,4,1,3};
		int[] resArr=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			resArr[i]=arr1[i]+arr2[i];
		}
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}
