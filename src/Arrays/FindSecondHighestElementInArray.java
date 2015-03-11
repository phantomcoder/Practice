package Arrays;

public class FindSecondHighestElementInArray 
{

	public static void main(String[] args)
	{
		
		int[] a = {1, 5, 4, 2, 11, 1, 1, 10, 7, 8, 9};

		System.out.println(findSecondHighestInArray(a));
	}
	
	private static int findSecondHighestInArray(int[] given) throws IllegalArgumentException
	{
		
		if(given == null | given.length <1)
			throw new IllegalArgumentException();
		
		int max = given[0];
		int min = Integer.MIN_VALUE;
		for(int i=0; i< given.length;i++)
		{
			if(given[i] > max)
			{
				min = max;
				max = given[i];
			}
			else if(given[i] > min)
			{
				min = given[i];
			}
		}
		
		return min;
		
	}

}
