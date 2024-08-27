//Write a java program to find out given alphabet is a upper case letter, lower case letter , digit or a special symbol?
import java.util.Scanner;
class CheckChar
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		//if (ch>='A' || ch<='Z')   //we can also write like this
		if(Character.isUpperCase(ch))
			System.out.println("is upper");
		else if(Character.isLowerCase(ch))
			System.out.println("is lower");
		else if(Character.isDigit(ch))
			System.out.println("is Digit");
			else
			System.out.println("special char");
	}
}
