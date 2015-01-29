package DesignPatterns;

public class SingletonEarlyLoading
{
	private static final SingletonEarlyLoading singletonInstance = new SingletonEarlyLoading();
	
	private SingletonEarlyLoading()
	{
		
	}
	
	public static SingletonEarlyLoading getInstance()
	{
		return singletonInstance;
	}

}
