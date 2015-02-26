package DynamicProgramming;


public class CoinChangeProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] denoms = {5,25};
		int target = 75;
		CoinChangeAnswer answer = findAllPossibleCombinations(target, denoms);
		
		for(int i =0; i< answer.allPossibleChanges.size(); i++)
		{
			System.out.println(answer.allPossibleChanges.get(i));
		}

	}

	private static void findAllCombinationsRecursive(String tsoln,int startIx,int remainingTarget,
			                                         CoinChangeAnswer answer)
	{
	    for(int i=startIx; i<answer.denoms.length ;i++) {
	        int temp = remainingTarget - answer.denoms[i];
	        String tempSoln = tsoln + "" + answer.denoms[i]+ ",";
	        if(temp < 0) {
	         break;
	        }
	        if(temp == 0) {
	         // reached the answer hence quit from the loop
	         answer.allPossibleChanges.add(tempSoln);
	         break;
	        } 
	        else {
	        // target not reached, try the solution recursively with the
	        // current denomination as the start point.
	         findAllCombinationsRecursive(tempSoln, i, temp, answer);
	        }
	     }
	 }
	
	public static CoinChangeAnswer findAllPossibleCombinations(int target, int[] denoms) {
		CoinChangeAnswer soln = new CoinChangeAnswer(target,denoms);
		String tempSoln = new String();
		findAllCombinationsRecursive(tempSoln, 0, target, soln);
		return soln;
	}
}
