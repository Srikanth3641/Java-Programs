/*Write a java program to delete first occurance of a given element?

input:
	arr = 6 4 2 3 9 2 7 2 1 
	element = 2 

output:
	6 4 3 9 2 7 2 1 
*/
class Del_First_Occur
{
	public static void main(String[] args) 
	{
		int[] arr={6,4,2,3,9,2,7,2,1};
		int element=2;
		int j=0;
		int cnt=0;
		
		int[] resArr=new int[arr.length-1];
		for(int i=0;i<arr.length;i++)
			
		{
			
			if(arr[i]==element && cnt==0)
			{
				cnt=1;
				continue;
			}
			resArr[j++]=arr[i];

		}
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}
