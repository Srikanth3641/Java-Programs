//Write a java program to display multiplication table of a given number?
import java.util.Scanner;
class Table1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}
}
