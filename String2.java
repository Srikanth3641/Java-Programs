/*Write a java program to display plaindrome strings ?

input:
	racar is madam for dad

output:
	racar  madam  dad 
*/
//import java.util.Array;
class String2
{
	public static void main(String[] args) 
	{
		String str="racar is madam for dad";
		String[] sarr=str.split(" "); //covernt into array
		//for each loop
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();
			String rev="";
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}
			if(s.equals(rev))
			{
				System.out.print(s+" ");
			}
		}
	}

}
