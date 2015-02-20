package Matrix;

public class RotateAMatrixClockWise {

	/**
	 * @param args
	 */
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
		
		matrix = rotateAMatrix(matrix, 4);
		
		for(int i =0; i<4; i++)
		{
			for(int j =0; j<4;j++)
			{
				System.out.println(matrix[i][j]+"");
			}
			System.out.println("\n");
		}
	}
	
	private static int[][] rotateAMatrix(int[][] given, int size)
	{
		
		
		for(int i = 0; i < size/2; i++)
		{
			for(int j =i; j< size-i-1;j++)
			{
				// Save top
				int tmp = given[i][j];
				
				//Move bottom left
				given[i][j] = given[size-j-1][i];
				
				given[size-j-1][i] = given[size-i-1][size-j-1];
				
				given[size-i-1][size-j-1] = given[j][size-i-1];
				
				given[j][size-i-1] = tmp;
				
			}
			
		}

		return given;
	}

}
