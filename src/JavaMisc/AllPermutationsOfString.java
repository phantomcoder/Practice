package JavaMisc;

import java.util.HashSet;
import java.util.Set;

public class AllPermutationsOfString {

	public static void main(String[] args) 
	{
	
		String given = "ABC";
		
		System.out.println(printAllPermutations(given));
	}
	
	private static Set<String> printAllPermutations(String given)
	{
		
		Set<String> result = new HashSet<String>();
		
		if(given == null)
			return null;
		else if(given.length() == 0)
		{
			result.add("");
			return result;
		}

		char firstChar = given.charAt(0);
		String rem = given.substring(1);
		Set<String> words = printAllPermutations(rem);
		for(String newString : words)
		{
			for(int i =0; i <=newString.length(); i++)
			{
				result.add(resultCharAdd(newString,firstChar,i));
			}
		}
		
		return result;
	}
	
	private static String resultCharAdd(String str, char c, int k)
	{
		String first = str.substring(0,k);
		String last = str.substring(k);
		return first+c+last;
	}

}
