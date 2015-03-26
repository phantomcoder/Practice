package Arrays;

/*
 * Given an an unsorted array, sort the given array. You are allowed to do only following operation on array.

flip(arr, i): Reverse array from 0 to i 
Unlike a traditional sorting algorithm, which attempts to sort with the fewest comparisons possible, the goal is to sort the sequence in as few reversals as possible.
 */
public class PancakeSorting {

	public static void main(String[] args) 
	{
	   int[] input = {23,10,20,11,12,6,7};
		
	   pancakeSorting(input);
	   
	   for(int i : input)
		   System.out.println(i);
	}

	/*
	 * There is a bug. TODO
	 */
	private static int[] pancakeSorting(int[] a)
	{
		int size = a.length;
		
		for(int k = size-1; k>0;k--)
		{
			int localmax = findMax(a, k);
			
			if(localmax != k)
			{
				flip(a, localmax);
				flip(a, k);
			}
		}
		
		return a;
	}
	
	private static void flip(int[] a,int i)
	{
		int start = 0,temp = 0;
		
		while(start < i)
		{
			temp = a[start];
			a[start] = a[i];
			a[i] = temp;
			start++;
			i--;
		}
	}
	
	private static int findMax(int[] b, int size)
	{
		int maxIndex = 0;
		
		for(int j =0; j< size;j++)
		{
			if(b[j] > b[maxIndex])
				maxIndex = j;
		}
		return maxIndex;
	}
} 
