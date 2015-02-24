package DesignPatterns;

public class StrategyContext 
{
	private Strategy strategy;
	public StrategyContext(Strategy str)
	{
		this.strategy = str;
	}
	
	public int executeStrategy(int a, int b)
	{
		return this.strategy.execute(a, b);
	}
}
