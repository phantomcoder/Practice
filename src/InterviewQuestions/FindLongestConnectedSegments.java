package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class FindLongestConnectedSegments {

	public static void main(String[] args)
	{
	  Segment[] segs = new Segment[5];
	  segs[0] = new Segment(1,2);
	  segs[1] = new Segment(3, 4);
	  segs[2] = new Segment(2, -1);
	  segs[3] = new Segment(5, -1);
	  segs[4] = new Segment(4, 5);
	  
	  Arrays.sort(segs, Segment.segmentComparator);
	  findLongest(segs);
   
	}
	
	private static void findLongest(Segment[] segments)
	{
		Stack<Segment> s = new Stack<Segment>();
		int maxPath = 0;
		ArrayList<Segment> a = new ArrayList<FindLongestConnectedSegments.Segment>();
		for(Segment segment : segments)
		{
			if(s.isEmpty())
				s.push(segment);
			else
			{
				if(s.peek().getNextID() != segment.getiD() || s.peek().getNextID() < 0)
				{
					if(s.size() > maxPath)
					{
						maxPath = s.size();
						while(!s.isEmpty())
						{
							a.add(s.pop());
						}
					}
					
					s.push(segment);
				}
				else
				{
					s.push(segment);
				}
			}
			
		}
		if(s.size() > maxPath)
		{
			while(!s.isEmpty())
			{
				Segment ss = s.pop();
				System.out.println(ss.getiD()+"->"+ss.getNextID()+"->");
			}
		}
		else
		{
			for(Segment as : a)
			{
				System.out.print(as.getiD()+"->"+as.getNextID()+"->");
			}
		}
	}

	static class Segment 
	{
		public int iD;
		public int nextID;
		
		public Segment(int id, int nextID)
		{
			this.iD = id;
			this.nextID = nextID;
		}
		
		public int getiD() {
			return iD;
		}
		public void setiD(int iD) {
			this.iD = iD;
		}
		public int getNextID() {
			return nextID;
		}
		public void setNextID(int nextID) {
			this.nextID = nextID;
		}
		
		public static final Comparator<Segment> segmentComparator = new Comparator<Segment>(){
			@Override
			public int compare(Segment o1, Segment o2) {
				return o1.iD - o2.iD;
			}
		};
			
		}
}
