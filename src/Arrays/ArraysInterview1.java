package Arrays;

public class ArraysInterview1 {

	public static void main(String[] args) 
	
	{
		int[] a = {5,10,5,7,3,8,2};
		int target = 10;
		
		for(int i =0; i<a.length; i++)
		{
		    int y = target -a[i];
		    for(int j = i+1; j <a.length; j++)
		    {
		    	if (a[j] == y)
		    	{
		    		System.out.println(a[i]);
		    	}
		    }
		  
		}
	}

}
