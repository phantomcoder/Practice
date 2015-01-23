package Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) 
	{
	  int[] a = {2,7,0,0,0,0};
	  int[] b = {5,8,12,14};
	  
 
	  int [] c = mergeSortedArrays(a, b, 2, 4);
	  
	  for(int i = 0; i<c.length;i++)
		  System.out.println(c[i]);
	  
	}
	
	private static int[] mergeSortedArrays(int[] a, int[] b, int m, int n)
	{
		int k = m+n -1;
		while(m>0 && n> 0)
		{
			if(a[m-1] > b[n-1])
			{
				a[m+n-1] = a[m-1];
				m--;
			}
			else
			{
				a[m+n-1] = b[n-1];
				n--;
			}
		}
		
		return a;
	}

}
