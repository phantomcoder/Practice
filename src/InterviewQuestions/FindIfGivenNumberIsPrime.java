package InterviewQuestions;

public class FindIfGivenNumberIsPrime {

	public static void main(String[] args) 
	{
		System.out.println(isPrime(50));

	}
	
	private static boolean isPrime(int given)
	{
		boolean result = true;
		
		for(int i = 2; i < given; i++)
		{
			if(given%i == 0)
				result = false;
			    break;
			    
		}
		
		return result;
	}

}
