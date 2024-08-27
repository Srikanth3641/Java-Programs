/* Write a java program to display the string in a given format?

input:
	XYZ

output:
	XY
	XZ
	YX
	YZ
	ZX
	ZY 
*/
class string3
{
	public static void main(String[] args) 
	{
		String str="xyz";
		for (int i=0;i<str.length() ;i++ )
		{
			for (int j=0;j<str.length() ;j++ )
			{
				if(i!=j)
				{
					System.out.println(str.charAt(i)+ ""+str.charAt(j));
				}
			}
		}
	}
}
