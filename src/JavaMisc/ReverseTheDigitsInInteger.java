package JavaMisc;

public class ReverseTheDigitsInInteger {

	public static void main(String[] args)
	{
		System.out.println(reverseInteger(24567));

	}
	
	private static int reverseInteger(int given)
	{
		int result = 0;
		
		while(given >0)
		{
			result = result*10+given%10;
			given = given/10;
		}
		return result;
	}

}
