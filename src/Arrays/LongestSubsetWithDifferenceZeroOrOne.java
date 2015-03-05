package Arrays;

/*
 * Print subset where the difference between max and min number is either 0 or 1
 */
public class LongestSubsetWithDifferenceZeroOrOne {

	public static void main(String[] args) 
	{
	
		   int[] input = {2,6,7,9,1,0,1,0,2,3,6};
		    
		    printSubset(input);
		    }
	

    private static void printSubset(int[] a)
    {
    	int size = a.length;
    	int sequenceStart = 0, sequenceEnd = 0;
    	int finalSequenceStart = 0, finalSequenceEnd = -1;
    	int min = a[0];
    	
    	for(int j = 0;j< size; j++)
    	{
    		if((a[j]-min <= 1) && (a[j] - min >= -1))
    		{
    			sequenceEnd = j;
    			if(a[j] < min)
    				min = a[j];
    			if((finalSequenceEnd-finalSequenceStart)< (sequenceEnd-sequenceStart))
    			{
    				finalSequenceEnd = sequenceEnd;
    				finalSequenceStart = sequenceStart;
    			}
    			
    		}
    		else
    		{
    			min = a[j];
    			//max = a[j];
    			sequenceStart = j;
    			sequenceEnd = j;
    		}
    	}
    	
    	System.out.println("Sequence Start is: "+finalSequenceStart+" Sequence End is:" +finalSequenceEnd);
    	
    }

}
