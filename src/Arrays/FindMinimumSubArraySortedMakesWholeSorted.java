package Arrays;

/*
 *  Find minimum length of subarray which when sorted makes whole array sorted
 */
public class FindMinimumSubArraySortedMakesWholeSorted {

	public static void main(String[] args) 
	{
		
		int[] a = {10,12,20,30,25,40,32,31,35,50,60};
		findMinSubArray(a);
	
	}
	
	private static void findMinSubArray(int[] given)
	{
		int size = given.length;
		int start = -1, end = -1;
		for(int i = 1; i<size;i++)
		{
			if(given[i] > given[i+1])
			{
				start = i;
				break;
			}
		}
		for(int j =size-1;j>0;j--)
		{
			if(given[j] < given[j-1] )
			{
				end = j;
				break;
			}
		}
		int min =given[start],max =given[start];
		for(int i =start+1; i<=end;i++)
		{
			if(given[i] >max)
				max=given[i];
			if(given[i]<min)
				min = given[i];
		}
		
		for(int i = 0; i<start;i++)
		{
			if(given[i]>min)
			{
				start = i;
				break;
			}
		}
		for(int i=size-1;i>=end+1;i--)
		{
			if(given[i]<max)
			{
				end = i;
				break;
			}
		}
		
		System.out.println("The start is: "+start+"End is: "+end);
	}

}
