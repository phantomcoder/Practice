package InterviewQuestions;

import java.util.HashMap;

public class OneStringFromAnothrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(canBeFormedByAnother("teeaa", "tee"));

	}
	
	
	private static boolean canBeFormedByAnother(String source, String destination)
	{
		if(source.length() != 0 && destination.length() == 0)
		{
			return false;
		}
		
		char[] a = source.toLowerCase().toCharArray();
		char[] b = destination.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> kv = new HashMap<>();
		for(char i : a)
		{
			if(kv.containsKey(i))
			{
				int tmp = kv.get(i);
				tmp++;
				kv.put(i, tmp);
			}
			else
				kv.put(i, 1);
		}
		
		for(char j : b)
		{
			if(kv.containsKey(j) && kv.get(j) > 0)
			{
				kv.put(j, kv.get(j)-1);
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

}
