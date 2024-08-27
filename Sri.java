import java.util.Scanner;
class Sri
{
	
  public void sum(int a,int b){
	int temp1=a+b;
	System.out.println(temp1);
}
public void square(int a){
	int temp2=a*a;
	System.out.println(temp2);

}
public void cube(int a){
	int temp3=a*a*a;
	System.out.println(temp3);

}

	public static void main(String[] args)
	{
	Sri s1=new Sri();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();

	s1.sum(a,b);
	s1.square(a);
	s1.cube(a);
	}
}