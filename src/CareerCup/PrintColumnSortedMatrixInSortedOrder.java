package CareerCup;
/*
Given an m x n matrix where each row element is sorted, 
but the columns do not appear in sorted order, write a 
function to print each matrix element in sorted order.
Example matrix: 
matrix = [ 
[20, 40, 80], 
[5, 60, 90], 
[45, 50, 55] 
] 
Your function should print 5, 20, 40, 45, 50, 55, 60, 80, 90. 
Add on: Assume that we are space-constrained such that we can 
only hold one row in memory at a time. Optimize your function 
to work under such constraints as efficiently as possible.
*/
public class PrintColumnSortedMatrixInSortedOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[][] a = new int[2][2];
		a[0][0] = 20;
		a[0][1] = 40;
		a[0][2] = 80;
		
		a[1][0] = 5;
		a[1][1] = 60;
		a[1] [2] = 90;
		
		a[2][0] = 45;
		a[2][1] = 50;
		a[2][2] = 55;
		
		printInSortedOrder(a);

	}
	
	private static void printInSortedOrder(int[][] given)
	{
		
		
		
	}

}
