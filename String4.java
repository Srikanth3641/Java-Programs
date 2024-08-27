/*Write a java program to check given string is Anagram or not?

input:
	str1= "silent";
	str2= "listen";
*/
import java.util.Arrays;
class String4
{
	public static void main(String[] args) 
	{
		String str1="silent";
		String str2="listen";
		char[] carr1=str1.toCharArray();
		char[] carr2=str2.toCharArray();
		Arrays.sort(carr1);
		Arrays.sort(carr2);
		boolean flag=true;
		for(int i=0;i<carr1.length & i<carr2.length;i++)
		{
			if(carr1[i] != carr2[i])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("it is a Anagram");
		}
		else
		{
			System.out.println("not");
		}
	}
}
