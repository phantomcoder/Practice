package Arrays;

public class NumberOccuringOddTimes {

	// Print number occuring odd number of times.
	public static void main(String[] args) 
	{
		int[] a = {1,2,1,2,3,3,3};
		findOddOccuringNumber(a);
		
	}
	
	private static void findOddOccuringNumber(int[] input)
    {
		int res = 0;
		for(int i=0; i<input.length; i++)
		{
			res = res^input[i];
		}
		System.out.println(res);
	}

}
