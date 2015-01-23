package Arrays;

public class BinarySearchInArray {

	public static void main(String[] args) 
	{
	
		int[] input = {1,2,3,5,9,10,11,15,16,17,18};
		
		System.out.println(binarySearchInArray(input, 0, input.length, 10));
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

}
