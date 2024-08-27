/*Write a java program to display the given string in a below format?

input:
	A1B2C3D4

output:
	ABBCCCDDDD
	*/

class String1
{
	public static void main(String[] args) 
	{
		String str="A5B1C6D4";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int k=Character.getNumericValue(str.charAt(i));
				for(int j=0;j<k-1;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
}
