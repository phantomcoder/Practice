package Threads;

public class PrinterThread implements Runnable {

	@Override
	public void run() 
	{
	  System.out.println("This is test");
	}

	public static void main(String[] args)
	{
		for(int i =0; i<3;i++)
		{
		 new Thread(new PrinterThread()).start();
		}
	}
}


