package Arrays;

public class BinarySearchInPivotedArray {

	public static void main(String[] args) 
	{
	   int[] input = {3,4,1,2,3};
	   
 System.out.println(findPivotPoint(input, 0, input.length));
	System.out.println(pivotedBinarySearch(input, 0, input.length, 3));
	}

	private static int pivotedBinarySearch(int[] a, int low, int high, int number)
	{
		int pivot = findPivotPoint(a, low, high);
		
		if(pivot == -1)
			return binarySearchInArray(a, low, high, number);
		
		if(a[pivot] == number)
			return pivot;
		else if (a[0] <= number)
			return binarySearchInArray(a, 0, pivot, number);
		else return binarySearchInArray(a, pivot, high, number);
	}

	private static int binarySearchInArray(int[] a, int low, int high, int number)
	 {
		 if(high <low) return -1;
		 int mid = (high+low)/2;
		 
		 if(number == a[mid])
			 return mid;
		 
		 else if (number < a[mid])
		 {
			return binarySearchInArray(a, low, mid-1, number);
		 }
		 else 
		 {
			 return binarySearchInArray(a, mid+1, high, number); 
		 }
		 
	 }
	
	private static int findPivotPoint(int[] a, int low, int high)
	{

		int mid = (high+low)/2;
		
		if(a[mid] < a[mid-1])
			return mid;
		if(a[mid] > a[high-1])
			return findPivotPoint(a, mid+1, high-1);
		else
			return findPivotPoint(a, low, mid);
	}
	
}
