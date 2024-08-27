class Spiral_matrix 
{
	public static void main(String[] args) 
	{
		int [][] matrix={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int rows=matrix.length;
			int cols=matrix[0].length;
			int top=0;
			int bottom=rows-1;
			int left=0;
			int right=cols-1;
			while(true)
		{
			
			if (left>right)
			{
				break;
			}
			for (int i=left;i<=right ;i++ )
			{
				System.out.print(matrix[top][i]+" ");
			}
			top++;
			/*if (top>bottom)
			{
				break;
			}*/
			for (int i=top;i<=bottom ;i++ )
			{
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			/*if (left>right)
			{
				break;
			}*/
			for (int i=right;i>=left ;i-- )
			{
				System.out.print(matrix[bottom][i]+" ");
			}
			bottom--;

			/*if (top>bottom)
			{
				break;
			}*/
			for (int i=bottom;i>=top ;i-- )
			{
				System.out.print(matrix[i][left]+" ");
			}
			left++;



		}
			
	}
}
