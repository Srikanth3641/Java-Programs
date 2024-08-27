//Write a java program to count number of vowels present in string?
class Count_Vowels_String
{
	public static void main(String[] args) 
	{
		String str=new String("Srikanth");
		int cnt=;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
