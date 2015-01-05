package CrackingTheCodingInterview.Chapter1;

public class StringUniqueBitVector 
{

	//Explanation :- 
	// http://stackoverflow.com/questions/9141830/explain-the-use-of-a-bit-vector-for-determining-if-all-characters-are-unique
	public static void main(String[] args) 
	{
		String str = "abcdc";
		int checker = 0;
		 for (int i = 0; i < str.length(); ++i) {
		 int val = str.charAt(i) - 'a';
		 if ((checker & (1 << val)) > 0) 
		 {
			 System.out.println("The string is not unique");
		 }
		 System.out.println("Shift Value "+(1<<val));
		 checker |= (1 << val);
		 }	 
	}
}
