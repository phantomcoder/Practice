package Arrays;

public class ReverseAnArray {

	public static void main(String[] args) 
	{
		
		int[] a = {1,4,6,7,9,3,2,5,10,14};
		int temp;
		
		int start = 0,end = a.length-1;
		
		while(start < a.length/2)
		{
			temp = a[end];
			a[end] = a[start];
			a[start] = temp;
			end--;
			start++;
		}
		
		for(int i =0; i< a.length; i++)
			System.out.println(a[i]);

	}

}
