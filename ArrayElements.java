import java.util.Scanner;
class ArrayElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=sc.nextInt();
		System.out.println("Enter the col");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
			for (int i=0;i<rows ;i++ )
			{
			for (int j=0;j<cols ;j++ )
			{
				System.out.print("Enter the elements");
				arr[i][j]=sc.nextInt();
			}
			}
			//display elements
			for (int i=0;i<rows ;i++ )
			{
				for (int j=0;j<cols ;j++ )
				{
					System.out.print(arr[i][j]*arr[i][j]+" ");
				}
				System.out.println();
			
		}
	}
}
