package Arrays;

public class ContinguousSubArray {

	public static void main(String[] args) 
	{
	
		int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(input));
	}
	
	 public static int maxSubArray(int[] A) 
	    {
	        int maxsum = A[0];
	        int max = A[0];
	        
	        for(int i=1; i< A.length;i++)
	        {
	            maxsum = Math.max(maxsum+A[i],A[i]);
	            max = Math.max(max,maxsum);
	        }
	        return max;
	        
	    }

}
