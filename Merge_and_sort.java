/*Q) Write a java program to merge two arrays and display them in sorting order?

Input:
	5 2 1 3 4 
	9 7 8 6 10
*/
//import java.util.Arrays;
class Merge_and_sort  
{
	public static void main(String[] args) 
	{
		int[] arr1={5,2,1,3,4}; 
		int[] arr2={9,7,8,6,10};
		int[] resArr=new int[arr1.length+arr2.length];

		/*int size1=arr1.length; // 5
		  int size2=arr2.length; // 5

		  arr1=Arrays.copyOf(arr1,size1+size2);
		
		  int j=0;*/

		for(int i=0;i<arr1.length;i++)
		{
			resArr[i]=arr1[i];
			for(int j=0;j<arr2.length;j++)
			{
				resArr[i+arr1.length]=arr2[i];
			}
		
		}

		//sorting
		Arrays.sort(resArr);

		//display
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}

	}
}
