package ShiftOperations;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bacb";
		int checker = 0;
		 for (int i = 0; i < str.length(); ++i) {
		 int val = str.charAt(i) - 'a';
		 if ((checker & (1 << val)) > 0) 
			System.out.println("The string is not unique");
		 checker |= (1 << val);
		 }	 
	}
}

