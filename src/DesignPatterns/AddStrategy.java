package DesignPatterns;

public class AddStrategy implements Strategy {

	@Override
	public int execute(int a, int b) 
	{
		System.out.println("Called Add Strategy");
		return (a+b);
	}

}
