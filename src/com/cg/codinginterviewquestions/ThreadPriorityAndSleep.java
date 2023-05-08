package com.cg.codinginterviewquestions;

class example extends Thread{
	public void run()
	{
		for(int i=0;i<10; i++)
		{
			System.out.println("j value is "+i);
		}
	}
}

public class ThreadPriorityAndSleep implements Runnable {

	public void run()
	{
		for(int i=0; i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i value is "+i);
		}
	}
	public static void main(String[] args)  {
		
		example e = new example();
		e.setPriority(3);
		e.start();
		Runnable r = new ThreadPriorityAndSleep();
		Thread t = new Thread(r);
		t.setPriority(9);
		t.start();
		
	

	}

}
