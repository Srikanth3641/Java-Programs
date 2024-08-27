//Write a java program to check given alphabet is a vowel or consonent?

import java.util.Scanner;
class Check_Alphabet_Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char alpha=sc.next().charAt(0);
		switch(alpha)
			{
			case 'a':
				System.out.println("vowel");
				break;
			case 'e':
				System.out.println("vowel");
			break;
			case 'i':
				System.out.println("vowel");
			break;
			case 'o':
				System.out.println("vowel");
			break;
			case 'u':
				System.out.println("vowel");
			break;
			default :
				System.out.println("constant");

			
		
		}
	}
}
