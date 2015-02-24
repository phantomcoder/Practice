package DesignPatterns;

public class SubtractStrategy implements Strategy {

	@Override
	public int execute(int a, int b) 
	{
		System.out.println("Called subtract strategy");
		
		return (a-b);
	}

}
