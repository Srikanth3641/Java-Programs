//Write a java program to find out greatest of three numbers ?
import java.util.Scanner;
class Greatest_num
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b) && (a>c))
			System.out.println(a+" is greater num");
		else if((b>a) && (b>c))
			System.out.println(b+" is greater num");
		else if((c>a) && (c>b))
			System.out.println(c+" is greater num");

	}
}
