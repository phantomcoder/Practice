package DynamicProgramming;

import java.util.ArrayList;

public class CoinChangeAnswer {
	public int OPT[][];  	// contains the optimal solution
				// during every recurrence step.
	public String optimalChange[][]; // string representation of optimal solutions.

	/**
	 * List of all possible solutions for the target
	 */
	public ArrayList<String> allPossibleChanges = new ArrayList<String>();

	/**
	 * The target amount.
	 */
	private int target;

	/**
	 * Copy of the denominations that was used to generate this solution
	 */
	public int[] denoms;
	
	public CoinChangeAnswer(int target, int[] d)
	{
		this.target = target;
		this.denoms = d;
	}
};