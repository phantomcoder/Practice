package Arrays;

/*
 * Write a program to print all the LEADERS in the array. 
 * An element is leader if it is greater than all the elements to its right side. 
 * And the rightmost element is always a leader. 
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 * 
 * */
public class LeadersInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] givenArray = {16,17,4,3,5,2};
		printLeaders(givenArray);

	}
	
	private static void printLeaders(int[] array)
	{
		int currentValue = array[array.length-1];
		System.out.println(currentValue);
		for(int i = array.length-2; i>=0;i--)
		{
			if(array[i] > currentValue)
			{
				System.out.println(array[i]);
				currentValue = array[i];
			}
			
		}
	}

}
