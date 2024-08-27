/*Write a java program to display number of upper case letters, lowercase letters, digits,
words and spaces in a given string?

input:
	This Is Java Class34

output:
	uppercase letters : 4
	lowercase lettesr : 11
	Digits : 2 
	words : 4 
	spaces : 3
*/
class String_All_Cases
{
	public static void main(String[] args) 
	{
		int upper=0,lower=0,digits=0,words=1,spaces=0;
		String str=new String("sai Charan Done3536");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upper++;
			}
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else if(str.charAt(i)==' ')
			{
				spaces++;
				words++;
			}
		}
		System.out.println("uppercase :"+upper);
		System.out.println("lowercase :"+lower);
		System.out.println("digits :"+digits);
		System.out.println("spaces :"+spaces);
		System.out.println("words :"+words);


				
	}
}
