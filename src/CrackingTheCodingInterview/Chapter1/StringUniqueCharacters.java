package CrackingTheCodingInterview.Chapter1;

public class StringUniqueCharacters {

	
	/*
	 * 
	 * Given a String determine if it has all unique charcters.
	 **/
	public static void main(String[] args)
	{
		String s = "duplicate";
		boolean isUnique = true;
		boolean [] boolArray = new boolean[256];
		for (int i =0; i<s.length();i++)
		{
			int val = s.charAt(i);
			if(boolArray[val] == false)
				boolArray[val] = true;
			else 
				isUnique = false;
		}			
	}

}
