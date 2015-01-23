package Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) 
	{
		int[] input = {1,2,4,6,3,7,8,5,10};
		
		System.out.println(findMissingNumber(input, input.length+1));
	}
	
	private static int findMissingNumber(int[] a, int n)
	{
		int sum = n*(n+1)/2;
		
		int arraysum = 0;
		
		for(int i = 0; i<a.length; i++)
			arraysum += a[i];
		
		return (sum-arraysum);
	}

}
