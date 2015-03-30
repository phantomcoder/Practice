package Matrix;

public class PrintMatrixInDiagonal {

	public static void main(String[] args) 
	{
	
		int[][] given = new int[5][4];
		int k = 0;
		
		for(int i = 0; i< 5;i++)
		{
			for(int j = 0; j< 4;j++)
			{
				given[i][j] = ++k;
			}
		}

		printInDiagonal(given, 5, 4);
		
	}
	
	private static void printInDiagonal(int[][] printableMatrix, int rows, int columns)
	{
	   for(int r = 0; r< rows; r++)
	   {
		   for(int i = r,j=0;j<columns&&i>=0;i--,j++)
		   {
			   System.out.print(printableMatrix[i][j]+" ");
		   }
		   System.out.println();
	   }
		
	   for(int c=1;c<columns;c++){
			for(int j=c,i=rows-1;j<columns&&i>=0;i--,j++){
				System.out.print(printableMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
