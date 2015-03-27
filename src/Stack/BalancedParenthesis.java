package Stack;

import java.util.HashMap;
import java.util.Stack;

/*
 * Check if paranthesis are balanced.
 */
public class BalancedParenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(checkBalanced("[{}({[]})]"));

	}
	
	private static boolean checkBalanced(String s1)
	{

	   if(s1 == null)
	   return true;
	   
	   if(s1.length()%2 != 0)
	   return false;
	   
	   
	   HashMap<Character,Character> hmap = new HashMap<Character,Character>();
	   hmap.put('(',')');
	   hmap.put('[',']');
	   hmap.put('{','}');
	     
	   char[] ss1 = s1.toLowerCase().toCharArray();
	     
	     Stack<Character> s = new Stack<Character>();
	     
	     for(char c : ss1)
	     {
	         if(hmap.keySet().contains(c))
	             s.push(c);
	             
	         else if(hmap.values().contains(c))
	             {
	               if(!s.isEmpty()&&hmap.get(s.peek())== c)
	               {
	               s.pop();
	               }
	               else
	               return false;
	             }
	     }   
	     return s.isEmpty();
	}
}
