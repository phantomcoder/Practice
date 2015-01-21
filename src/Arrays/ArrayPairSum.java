package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSum {

	public static void main(String[] args) 
	{
		int[] a = {2,4,45,6,10,8,12};
		int target = 16;
		printPairs(a, target);	

	}
	
	
	private static void printPairs(int[] input, int target)
    {
		
		Map storeMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i< input.length; i++)
		{
			if(storeMap.containsKey(input[i]))
			{
				System.out.println("Pair Found"+input[i]+":"+storeMap.get(input[i]));
			}
			else
			{
				storeMap.put(target-input[i], input[i]);
			}
		}
	}
}
