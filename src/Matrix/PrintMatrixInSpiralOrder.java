package Matrix;

public class PrintMatrixInSpiralOrder {

	public static void main(String[] args)
	{
		
		int[][] matrix = new int[4][4];
		
		int k = 0;
		for(int i = 0; i < 4; i ++)
		{
			for(int j = 0; j < 4; j++)
			{
				matrix[i][j] = ++k;
			}
		}
		
		printInSpiral(matrix, 4);
	}

	private static void printInSpiral(int[][] given, int size)
	{
		int endingRowIndex = size, endingColumnIndex = size; 
		int startRowIndex =0; int startColumnIndex = 0;
		
		while(startColumnIndex < endingColumnIndex && startRowIndex < endingRowIndex)
		{
			for(int i = startColumnIndex; i < endingColumnIndex; ++i )
			{
				System.out.println(given[startColumnIndex][i]);
			}
			startRowIndex++;
			
			for(int j = startRowIndex; j <endingRowIndex; ++j)
			{
				System.out.println(given[j][endingColumnIndex-1]);
			}
			endingColumnIndex--;
			
			if(startRowIndex < endingRowIndex)
			{
				for(int m = endingColumnIndex -1; m >= startColumnIndex;--m)
				{
					System.out.println(given[endingRowIndex-1][m]);
				}
				endingRowIndex--;
			}
			if(startColumnIndex< endingColumnIndex)
			{
				for(int n = endingRowIndex-1; n>=startRowIndex;--n)
				{
					System.out.println(given[n][startColumnIndex]);
				}
				startColumnIndex++;
			}
			
		}
		
		
	}
}
