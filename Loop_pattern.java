class Loop_pattern 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=3 ;i++ )
		{
			for (int j=1;j<=6 ;j++ )
			{
				if (i+j==4||i+j==6||i+j==8)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}
