package Arrays;

public class RotateAnArray {

	public static void main(String[] args)
	{
	
		int[] a = {1,2,3,4,5,6,7,8};
		rotateAnArray(a, 3);
		for(int i =0; i< a.length; i++)
			System.out.println(a[i]);
	}
	
	// Return an array by D positions
	
	//Complexity is O(n*d)
	private static int[] rotateAnArray(int[] input, int d)
	{
		
		int rotations = 0;
		while(rotations <d)
		{
		for(int i = 0; i <input.length-1;i ++)
		{
			int tempp = input[i];
			input[i] = input[i+1];
			input[i+1] =tempp;
		}
		
		rotations++;
		}
		return input;
	}

}
