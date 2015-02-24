package Arrays;

/*
 * The idea is reverse the array from 0 to d
 * Then reverse the array from d to length
 * And finally reverse the whole array.
 * Running time if O(n)
 */
public class ArrayRotationByReversalAlgorithm {

	public static void main(String[] args) 
	{
	
		int [] a = {1,2,3,4,5,6,7,8};
	
		rotateAnArray(a, 3);
		for(int i =0; i< a.length; i++)
			System.out.print(a[i]);

	}
	
	private static int[] rotateAnArray(int[] in, int d)
	{
		reverseArray(in,0,d-1);
		reverseArray(in, d, in.length-1);
		return reverseArray(in, 0, in.length-1);
	}
	
	private static int[] reverseArray(int[] input, int from, int to)
	{
		while(from < to)
		{
			int temp = input[from];
			input[from] = input[to];
			input[to] = temp;
			from++;
			to--;
		}
		return input;
	}

}
