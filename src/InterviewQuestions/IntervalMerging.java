package InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
/*
 * Can be modified to print open slots too.
 */
public class IntervalMerging {

	public static void main(String[] args) 
	{
	
		Interval[] b = new Interval[4];
		b[0] = new Interval(1,3);
		b[1]= new Interval(7,9);
		b[2] = new Interval(4,6);
		b[3] = new Interval(10,13);
		
		
		Arrays.sort(b, Interval.intervalComparator);
		printMergedNonOverlappingIntervals(b);
		
		
	}
	
	private static void printMergedNonOverlappingIntervals(Interval[] given)
	{
		
		Stack s = new Stack<Interval>();
		
		for(Interval c : given)
		{
			if(s.isEmpty())
				s.push(c);
			else
			{
				Interval top = (Interval) s.peek();
				if(top.getEndTime() < c.getStartTime())
					s.push(c);
				else if(top.getEndTime() < c.getEndTime())
				{
					top.setEndTime(c.getEndTime());
					s.pop();
					s.push(top);
				}
					
				
			}
		}
		
		System.out.println("printing Merged Intervals");
		
		while(!s.isEmpty())
		{
			Interval t = (Interval) s.pop();
			System.out.println("("+t.getStartTime()+","+t.getEndTime()+")");
		}
	}
	
	static class Interval 
	{
		private int startTime;
		private int endTime;
		public Interval(int startTime,int endTime)
		{
			this.startTime =startTime;
			this.endTime=endTime;
		}
		public int getStartTime() {
			return startTime;
		}
		public void setStartTime(int startTime) {
			this.startTime = startTime;
		}
		public int getEndTime() {
			return endTime;
		}
		public void setEndTime(int endTime) {
			this.endTime = endTime;
		}
		
		public static final Comparator<Interval> intervalComparator = new Comparator<Interval>() {
			
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.startTime - o2.startTime;
			}
		};
		

	}

}
