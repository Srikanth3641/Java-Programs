/*Write a Java program that takes a numerical score as input and prints out the corresponding letter grade based on the following criteria:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: Below 60*/
import java.util.Scanner;
class Grades
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m1 marks :");
		int m1=sc.nextInt();
		System.out.println("Enter m2 marks :");
		int m2=sc.nextInt();
		System.out.println("Enter m3 marks :");
		int m3=sc.nextInt();
		System.out.println("Enter m4 marks :");
		int m4=sc.nextInt();
		int total=m1+m2+m3+m4;
		float avg=(float)total/4;
		System.out.println("you got total " +total+ " marks :");
		System.out.println("average :"+avg);
		if((avg>90) &&(avg<100))
			System.out.println("A");
		else if((avg>80)&&(avg<89))
			System.out.println("B");
		else if((avg>70)&&(avg<79))
			System.out.println("C");
		else if((avg>60)&&(avg<69))
			System.out.println("D");
		else if(avg<60)
			System.out.println("Fail");


	}
}
