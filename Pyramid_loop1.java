class Pyramid_loop1 
{
	public static void main(String[] args) 
	{
		int rows=4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=(rows-i)*2;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
