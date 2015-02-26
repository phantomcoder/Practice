package JavaMisc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfStreamOfIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MedianOfStreamOfIntegers m = new MedianOfStreamOfIntegers();
		m.addNumbers(5);
		System.out.println(m.getMedian());
		
		m.addNumbers(4);
		System.out.println(m.getMedian());
		m.addNumbers(8);
		m.addNumbers(10);
		System.out.println(m.getMedian());
	}
	
	public static PriorityQueue<Integer> maxHeap;
	public static PriorityQueue<Integer> minHeap;
	public int elementsCount;
	
	public MedianOfStreamOfIntegers()
	{
		this.minHeap = new PriorityQueue<>();
		this.maxHeap = new PriorityQueue<>(10, MaxHeapComparator);
	}
	
	private Comparator<Integer> MaxHeapComparator = new Comparator<Integer>() 
			{
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2 - o1;
		}
		
	};
	
	public void addNumbers(int num)
	{
		maxHeap.add(num);
		if(elementsCount%2 == 0)
		{
			if(minHeap.isEmpty())
			{
				elementsCount++;
				return;
			}
			else if(maxHeap.peek() > minHeap.peek())
				{
					Integer maxHeapElement = maxHeap.poll();
					Integer minHeapElement = minHeap.poll();
					minHeap.add(maxHeapElement);
					maxHeap.add(minHeapElement);
					
				}
			
		}
		else
		{
			minHeap.add(maxHeap.poll());
		}
		elementsCount++;
	}
	
	public int getMedian()
	{
		if(elementsCount % 2 != 0)
			return maxHeap.peek().intValue();
		else
			return (maxHeap.peek()+minHeap.peek())/2;
		
	}
	

}
