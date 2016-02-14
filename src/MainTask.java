

public class MainTask {
public static void main(String[] args) {
	Thread1 th = new Thread1();
	
	th.start();
	
	if(th.isAlive())
	{
		System.out.println("Main thread will be alive if child thread is alive");
	}
	try{
		th.join();
	}
	catch(InterruptedException e)
	{
		System.out.println("Caught");
	}
	finally
	{
	System.out.println("Main thread over");
	}
}
}
