package Stack;

import java.util.Stack;

public class MinimumStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	    MinStack s = new MinStack();
	    s.add(5);
	    s.add(15);
	    s.add(5);
	    s.add(26);
	    
	    s.pop();
	    System.out.println(s.getMinimum());
		

	}

	
	public static  class MinStack extends Stack<Integer>
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		Stack<Integer> minStack = new Stack<Integer>();
		
		public void push(int x)
		{
			super.push(x);
			if(minStack.empty() || minStack.peek() > x)
				minStack.push(x);
		}
		
		public Integer pop()
		{
			int value = super.pop();
			if(value == getMinimum())
				minStack.pop();
			return value;
		}
		
		public Integer getMinimum()
		{
			if(minStack.isEmpty())
				return Integer.MAX_VALUE;
			else
				return minStack.peek();
			
		}
	}
}
