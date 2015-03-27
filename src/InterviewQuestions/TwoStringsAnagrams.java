package InterviewQuestions;

import java.util.Arrays;

/*
 * Check if two given strings are anagrams.
 */
public class TwoStringsAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
    System.out.print(areAnagrams_1("abc", "ABC"));

	}
	
	private static boolean areAnagrams_1(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		if(s1== null &&s2 != null)
			return false;
		if(s1 != null && s2 == null)
			return false;
		
	     char[] ss1 = s1.toLowerCase().toCharArray();
	     char[] ss2 = s2.toLowerCase().toCharArray();
	     
	     Arrays.sort(ss1);
	     Arrays.sort(ss2);
	     
         return Arrays.equals(ss1, ss2);
	}

}
