package Arrays;

/*
 * Given an array of positive numbers, find the maximum sum of a 
subsequence with the constraint that no 2 numbers in the sequence 
should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10)
or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).
*/
public class MaximumSumNoSubsequentElements {

	public static void main(String[] args) 
	{
	    int[] a = {3,2,7,10};
	    
	    System.out.println("The Max Sum is "+findMaximumSum(a));
	}
	
	private static int findMaximumSum(int[] input)
	{
		int sum = 0;
		boolean flipped;
		
		for(int i=0; i< input.length;i++)
		{
			
		}
		
		return sum;
	}

}
