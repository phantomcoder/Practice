package Threads;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException
	{
	
		String[] notes = {"This ", "is", "sparta", "!"};
		
		for(int i =0; i< notes.length;i++)
		{
			Thread.sleep(3000);
			//Thread.currentThread().sleep(1000);
			System.out.println(notes[i]);
		}
	}

}
