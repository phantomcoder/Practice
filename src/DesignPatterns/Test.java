package DesignPatterns;

public class Test {

	public static void main(String[] args) 
	{
	  //SingletoEnum.INSTANCE.doSomething();
		
		// Strategy DP code
		StrategyContext context;
		context = new StrategyContext(new AddStrategy());
		System.out.println(context.executeStrategy(2, 3));
		context = new StrategyContext(new SubtractStrategy());
		System.out.println(context.executeStrategy(4, 1));
		
	}

}
