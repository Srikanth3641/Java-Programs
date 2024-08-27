// Write a java program to multiply two arrays?
//Input:
//arr1 = 5 3 2 
//arr2 = 1 4
/*class Mul_two_Arrays
{
	public static void main(String[] args) 
	{
		int[] arr1={5,3,2};
		int[] arr2={1,4};
		int a=Integer.parseInt(array_To_String(arr1));
		int b=Integer.parseInt(array_To_String(arr2));
		System.out.print(a*b);


	}
	public static String array_To_String(int[] arr)
	{
		StringBuffer sb=new StringBuffer();
		for(int i:arr)
		{
			sb.append(i);
		}
		return sb.toString();

	}
}*/
class Mul_two_Arrays
{
	public static void main(String[] args) 
	{
		int[] arr1={5,3,2};
		int[] arr2={1,4};
		int a1=0;
		int b1=0;
		for(int i=0;i<arr1.length;i++)
		{
			a1=a1*10+arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			b1=b1*10+arr2[j];
		}
	
		System.out.println(a1*b1);
	}
}

