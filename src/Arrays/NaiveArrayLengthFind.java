package Arrays;

public class NaiveArrayLengthFind {

	public static void main(String[] args)
	{
	  int[] a = {1,2,3,4,5,6};
	  
	  System.out.println("The naive length of the array is "+naiveLength(a));
	}
	
	private static int naiveLength(int[] input)
	{
		int k = 1;
		try{
			while(k < Integer.MAX_VALUE)
			{
				int temp = input[k];
				
				k = 2*k;
				
			}
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			k = searchArrayHelper(input, k/2, k);
			try{
				while(true)
				{
				int p =	input[k];
					k++;
				}
			}catch(ArrayIndexOutOfBoundsException e)
			{
				k--;
			}
		}
		return k;
		
	}
	
	private static int  searchArrayHelper(int[] b, int i, int j)
	{
		try
		{
			int c = b[j];
			
		}catch(ArrayIndexOutOfBoundsException ee)
		{
			int mid = (i+j)/2;
			return searchArrayHelper(b, i, mid);
		}
		return 1;
	}

}
