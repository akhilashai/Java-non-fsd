package com.cg.codinginterviewquestions;

class Counter{
	int count;
	public void increment()
	{
		count++;
	}
}

public class RaceConditionEx {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Runnable r1 = new Runnable() {
			
			public void run()		// don't use synchronized keyword  u may lose some data bcz both thread has the value it takes only one to avoid this use synchronized keyword
			{					
				
				for(int i=0;i<=10;i++)
				{
					c.increment();
				}
			}
		};
		Runnable r2 = new Runnable() {
			
			public void run()
			{
				
				for(int i=0;i<=10;i++)
				{
					c.increment();
				}
			}
		};
		Thread t1= new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
	}

}
